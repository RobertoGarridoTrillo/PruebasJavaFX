package main.javatpoint;

import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo78_Media_Clips extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    URL resource = getClass().getResource("/main/audio/The.mp3");
    AudioClip clip = new AudioClip(resource.toString());
    
    Button button = new Button("8ing Zzzzt!");
    button.setTranslateX(260);
    button.setTranslateY(360);
    
    button.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent event)
      {
        clip.play();
      }


    });

//setting group and scene   
    Group root = new Group(button);
    Scene scene = new Scene(root, 600, 400);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Playing video");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

