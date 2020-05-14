package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo13_Quad_Curve extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Creating a QuadCurve 
    QuadCurve quadCurve = new QuadCurve();

    //Adding properties to the Quad Curve 
    quadCurve.setStartX(100.0);
    quadCurve.setStartY(220.0f);
    quadCurve.setEndX(500.0f);
    quadCurve.setEndY(220.0f);
    quadCurve.setControlX(250.0f);
    quadCurve.setControlY(000.0f);

    //Creating a Group object  
    Group root = new Group(quadCurve);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage 
    stage.setTitle("Drawing a Quad curve");

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

