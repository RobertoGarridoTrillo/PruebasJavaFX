package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

/**
 * 
 * @author Roberto Garrido TRillo
 */
public class Ejemplo59_Cylinder extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Drawing a Cylinder 
    Cylinder cylinder = new Cylinder();

    //Setting the properties of the Cylinder 
    cylinder.setHeight(300.0f);
    cylinder.setRadius(100.0f);

    cylinder.setTranslateX(400);
    cylinder.setTranslateY(400);
    cylinder.setTranslateZ(50);

    //Setting the perspective camera  
    PerspectiveCamera camera = new PerspectiveCamera();
    camera.setTranslateX(100);
    camera.setTranslateY(100);
    camera.setTranslateZ(00);

    //Creating a Group object  
    Group root = new Group(cylinder);

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

