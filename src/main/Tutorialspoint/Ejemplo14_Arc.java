package main.Tutorialspoint;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo14_Arc extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //Drawing a Circle 
    Arc circle = new Arc(300.0f, 135.0f, 100.0f, 100.0f, 000.0f,90.0f);

    //Creating a Group object  
    Group root = new Group(circle);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);
    //Setting title to the Stage 
    primaryStage.setTitle("Drawing a Circle");

    //Adding scene to the stage 
    primaryStage.setScene(scene);

    //Displaying the contents of the stage 
    primaryStage.show();
  }


  public static void main(String args[])
  {
    launch(args);
  }


}

