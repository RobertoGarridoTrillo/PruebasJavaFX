package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido TRillo
 */
public class Ejemplo60_Sphere extends Application
{

  @Override
  public void start(Stage stage)
  {
    ///Drawing a Sphere  
    Sphere sphere = new Sphere();

    //Setting the properties of the Cylinder 
    sphere.setRadius(100.0f);

    sphere.setTranslateX(400);
    sphere.setTranslateY(400);
    sphere.setTranslateZ(50);

    //Setting the perspective camera  
    PerspectiveCamera camera = new PerspectiveCamera();
    camera.setTranslateX(100);
    camera.setTranslateY(100);
    camera.setTranslateZ(00);

    //Creating a Group object  
    Group root = new Group(sphere);

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

