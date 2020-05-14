package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

/**
 *
 * @author ROBEG
 */
public class Ejemplo58_Box extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Drawing a Box 
    Box box = new Box();

    //Setting the properties of the Box 
    box.setWidth(100.0);
    box.setHeight(100.0);
    box.setDepth(100.0);
    
    box.setTranslateX(400);
    box.setTranslateY(300);
    box.setTranslateZ(50);

    //Setting the perspective camera  
    PerspectiveCamera camera = new PerspectiveCamera();
    camera.setTranslateX(100);
    camera.setTranslateY(100);
    camera.setTranslateZ(00);

    //Creating a Group object  
    Group root = new Group(box);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 600, Color.CHOCOLATE);

    // Adding the camera
    scene.setCamera(camera);

    //Setting title to the Stage 
    stage.setTitle("Drawing a Box");

    //Adding scene to the stage 
    stage.setScene(scene);

    //Displaying the contents of the stage 
    stage.show();
  }


  public static void main(String args[])
  {
    launch(args);
  }


}

