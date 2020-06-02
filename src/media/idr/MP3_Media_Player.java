package media.idr;

import java.io.File;
import static java.lang.Math.floor;
import static java.lang.String.format;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 *
 * @author Roberto Garrido Trillo
 */
public class MP3_Media_Player extends Application {


  private Media media;
  private MediaPlayer mediaPlayer;
  private MediaView mediaView;
  private Slider sliderMedia;
  private Duration duration;
  private Label time;
  private String mediaPlayerSlider;


  @Override
  public void start (Stage stage) {

    // Time laberl
    time = new Label("");

    time.setPrefWidth(80);

    // SliderMedia
    sliderMedia = new Slider();

    // Create the root
    VBox root = new VBox();
    root.setVgrow(sliderMedia, Priority.ALWAYS);
    root.setMinSize(350, 250);
    root.getChildren().addAll(sliderMedia, time);

    // Create the scene
    Scene scene = new Scene(root);

    // Create the stage
    stage.setMinHeight(300);
    stage.setMinWidth(600);
    stage.setTitle("MP3 Player");
    stage.setScene(scene);
    stage.show();
    try {

      String mediaUrl = filechooser(stage);
      media = new Media(mediaUrl);
      mediaPlayer = new MediaPlayer(media);
      setMediaPlayer(mediaPlayer);
      mediaView = new MediaView(mediaPlayer);

      root.getChildren().add(mediaView);
      mediaView.setFitWidth(600);
      mediaView.setFitHeight(300);
      mediaPlayer.setVolume(0.5);
      mediaPlayer.play();

      setSlider(sliderMedia);

      mediaPlayerSlider = "media";
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  /**
   * Returns a selectrd file
   *
   * @param stage
   *
   * @return the selected file
   */
  public String filechooser (Stage stage) {

    File file = null;
    String path = null;

    try {
      FileChooser fc = new FileChooser();
      // Set extension filter
      FileChooser.ExtensionFilter filterMP3 =
              new FileChooser.ExtensionFilter(
                      "Music files (*.mp3)", "*.mp3");
      FileChooser.ExtensionFilter filterMP4 =
              new FileChooser.ExtensionFilter(
                      "Video files (*.mp4, *.flv)", "*.mp4", "*.flv");
      FileChooser.ExtensionFilter filterAll =
              new FileChooser.ExtensionFilter(
                      "All files (*.*)", "*.*");

      fc.getExtensionFilters().addAll(filterMP3, filterMP4, filterAll);

      /* fc.getExtensionFilters().addAll(
                    new ExtensionFilter("Music files (*.mp3)", "*.mp3"),
                    new ExtensionFilter("All Video files (*.mp4, *.flv)",
                             "*.mp4", "*.flv"),
                    new ExtensionFilter("All files", "*")); */
      file = fc.showOpenDialog(stage);
      path = file.toURI().toString();
      path = path.replace("\\", "/");

    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return path;
  }


  /**
   * Setting the mediaplayer True if the media moves through the slider, false
   * if it moves alone
   *
   * @param mediaPlayer The objet mediaplayer
   */
  public void setMediaPlayer (MediaPlayer mediaPlayer) {

    mediaPlayer.currentTimeProperty().addListener(
            new ChangeListener<Duration>() {
      @Override
      public void changed (
              ObservableValue<? extends Duration> ov, Duration t, Duration t1) {

        if (mediaPlayerSlider.equals("media")) {
          updateValues(mediaPlayerSlider, mediaPlayer);
        }
      }


    });

    // When the mediaplayer is ready get the total fduration time
    mediaPlayer.setOnReady(() -> {
      duration = mediaPlayer.getMedia().getDuration();
      updateValues("media", mediaPlayer);
    });
  }


  /**
   * Setting the slider that control the media
   *
   * @param sliderMedia The objet slider
   */
  private void setSlider (Slider sliderMedia) {

    sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed (ObservableValue<? extends Number> ov, Number oldValue,
              Number newValue) {

        if (duration != null && mediaPlayerSlider.equals("slider")) {

          updateValues(mediaPlayerSlider, mediaPlayer);
        }
      }


    });

    sliderMedia.setOnMouseClicked((MouseEvent) -> {
      updateValues("media", mediaPlayer);
      mediaPlayerSlider = "slider";

    });


    sliderMedia.setOnMousePressed(new EventHandler<MouseEvent>() {
      @Override
      public void handle (MouseEvent t) {
        mediaPlayerSlider = "slider";
        System.out.println("pressed");
      }


    });

    sliderMedia.setOnMouseReleased(new EventHandler<MouseEvent>() {
      @Override
      public void handle (MouseEvent t) {
        mediaPlayerSlider = "media";

      }


    });


  }


  /**
   * change the values of the media when the slider is changed or the media is
   * changing
   *
   * @param origen If calling origin is slider, origin = true and media is not
   * join
   */
  public void updateValues (String mediaPlayerSlider, MediaPlayer mediaPlayer) {

    if (time != null && sliderMedia != null && duration != null) {
      Platform.runLater(new Runnable() {
        @Override
        public void run () {
          // Extract the current time of the mediaplayer
          Duration currentTime = mediaPlayer.getCurrentTime();

          // if origin is slider i move the media
          if (mediaPlayerSlider.equals("media")) {

            double d = duration.toMillis();
            double ct = mediaPlayer.getCurrentTime().toMillis();
            sliderMedia.setValue((ct / d) * 100.0);
          }

          // if origin is media I move the slider
          if (mediaPlayerSlider.equals("slider")) {

            // if duration is unknown don´t execute it
            sliderMedia.setDisable(duration.isUnknown());

            if (!sliderMedia.isDisabled() && duration.greaterThan(Duration.ZERO)) {
              mediaPlayer.
                      seek(duration.multiply(sliderMedia.getValue() / 100.0));
            }
          }
          time.setText(formatTime(currentTime, duration));
        }


      });
    }
  }


  /**
   * Format the Duration object elapsed
   *
   * @param elapsed (Duration currentTime = mediaPlayer.getCurrentTime();)
   * @param duration The total duration of the media
   * @return
   */
  public String formatTime (Duration elapsed, Duration duration) {
    int intElapsed = (int) floor(elapsed.toSeconds());
    int elapsedHours = intElapsed / (60 * 60);
    if (elapsedHours > 0) {
      intElapsed -= elapsedHours * 60 * 60;
    }
    int elapsedMinutes = intElapsed / 60;
    int elapsedSeconds = intElapsed - elapsedHours * 60 * 60 -
            elapsedMinutes * 60;

    if (duration.greaterThan(Duration.ZERO)) {
      int intDuration = (int) floor(duration.toSeconds());
      int durationHours = intDuration / (60 * 60);
      if (durationHours > 0) {
        intDuration -= durationHours * 60 * 60;
      }
      int durationMinutes = intDuration / 60;
      int durationSeconds = intDuration - durationHours * 60 * 60 -
              durationMinutes * 60;
      if (durationHours > 0) {
        return format("%d:%02d:%02d/%d:%02d:%02d",
                elapsedHours, elapsedMinutes, elapsedSeconds,
                durationHours, durationMinutes, durationSeconds);
      } else {
        return format("%02d:%02d/%02d:%02d",
                elapsedMinutes, elapsedSeconds, durationMinutes,
                durationSeconds);
      }
    } else {
      if (elapsedHours > 0) {
        return format("%d:%02d:%02d", elapsedHours,
                elapsedMinutes, elapsedSeconds);
      } else {
        return format("%02d:%02d", elapsedMinutes,
                elapsedSeconds);
      }
    }
  }


  public static void main (String[] args) {

    Application.launch(args);

  }


}

