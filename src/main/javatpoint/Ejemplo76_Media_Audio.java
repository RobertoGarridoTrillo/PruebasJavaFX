package main.javatpoint;

import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * AAC, AIFF, WAV, MP3
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo76_Media_Audio extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {

    //Initialising path of the media file, replace this with your file path   
    String path = "src/main/audio/1.wav";

    //Instantiating Media class  
    Media media = new Media(new File(path).toURI().toString());

    //Instantiating MediaPlayer class   
    MediaPlayer mediaPlayer = new MediaPlayer(media);

    //by setting this property to true, the audio will be played   
    mediaPlayer.setAutoPlay(true);
    primaryStage.setTitle("Playing Audio");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

