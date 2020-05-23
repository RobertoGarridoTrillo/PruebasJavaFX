package CookBook.media;

/**
 *
 * @author Roberto Garrido Trillo
 */
import java.net.URL;
import java.util.Map;
import javafx.application.Application;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaMarkerEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.Pair;

public class E20_MediaMarking extends Application
{
// Create the Area for Logging

   private TextArea messageArea = new TextArea();

   public static void main(String[] args)
   {
      Application.launch(args);
   }


   @Override
   public void start(Stage stage)
   {
// Locate the media content in the CLASSPATH
      URL mediaUrl = getClass().getResource("/main/media/test02_1280x720.mp4");
      String mediaStringUrl = mediaUrl.toExternalForm();

// Create a Media
      final Media media = new Media(mediaStringUrl);

// Create the Markers
      ObservableMap<String, Duration> markers = media.getMarkers();
      markers.put("START", Duration.ZERO);
      markers.put("2 SECONDS", Duration.seconds(2));
      markers.put("INTERVAL", media.getDuration().divide(2.0));
      markers.put("END", media.getDuration());
/*
      Another way to mark the video
      media.getMarkers().put("START", Duration.ZERO);
      media.getMarkers().put("2 SECONDS", Duration.seconds(2));
      media.getMarkers().put("INTERVAL", media.getDuration().divide(2.0));
      media.getMarkers().put("END", media.getDuration());
*/  

// Create a Media Player
      final MediaPlayer player = new MediaPlayer(media);

// Automatically begin the playback
      player.setAutoPlay(true);

// Create a 400X300 MediaView
      final MediaView mediaView = new MediaView(player);
      mediaView.setFitWidth(400);
      mediaView.setFitHeight(300);
      mediaView.setSmooth(true);

// Create the DropShadow effect
      DropShadow dropshadow = new DropShadow();
      dropshadow.setOffsetY(5.0);
      dropshadow.setOffsetX(5.0);
      dropshadow.setColor(Color.WHITE);

// Set the Effect on the MediaView
      mediaView.setEffect(dropshadow);

// Create the Buttons
      Button playButton = new Button("Play");
      Button stopButton = new Button("Stop");

// Create the Event Handlers for the Button
      playButton.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent event)
         {
            if (player.getStatus() == Status.PLAYING) {
               player.stop();
               player.play();
            } else {
               player.play();
            }
         }


      });
      stopButton.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent event)
         {
            player.stop();
         }


      });

// Add a marker event handler
      player.setOnMarker(new EventHandler<MediaMarkerEvent>()
      {
         public void handle(MediaMarkerEvent event)
         {
            Pair<String, Duration> marker = event.getMarker();
            String markerText = marker.getKey();
            Duration markerTime = marker.getValue();
            messageArea.appendText("\nReached the marker " + markerText
                    + " at " + markerTime);
            /*
            Another way
            String markerText = event.getMarker().getKey();
            Duration markerTime = event.getMarker().getValue();
            Duration markerTime = marker.getValue();
            messageArea.appendText("\nReached the marker " + markerText
                    + " at " + markerTime);
            */
         }


      });
      
      
// Looking at how much time the video has
      player.setOnReady(new Runnable()
      {
         @Override
         public void run()
         {
            System.out.println("Duration: " + media.getDuration().toSeconds());

            // display media's metadata
            for (Map.Entry<String, Object> entry : media.getMetadata().entrySet()) {
               System.out.println(entry.getKey() + ": " + entry.getValue());
            }
         }
      });
      

// Create the HBox
      HBox controlBox = new HBox(5, playButton, stopButton);
// Create the VBox
      VBox root = new VBox(5, mediaView, controlBox, messageArea);
// Set the Style-properties of the HBox
      root.setStyle("-fx-padding: 10;"
              + "-fx-border-style: solid inside;"
              + "-fx-border-width: 2;"
              + "-fx-border-insets: 5;"
              + "-fx-border-radius: 5;"
              + "-fx-border-color: blue;");
// Create the Scene
      Scene scene = new Scene(root);
// Add the scene to the Stage
      stage.setScene(scene);
// Set the title of the Stage
      stage.setTitle("A Markers Example");
// Display the Stage
      stage.show();
   }


}

