package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;

/**
 *The following commands are available for path data:

    M = moveto
    L = lineto
    H = horizontal lineto
    V = vertical lineto
    C = curveto
    S = smooth curveto
    Q = quadratic Bézier curve
    T = smooth quadratic Bézier curveto
    A = elliptical Arc
    Z = closepath

 * @author Roberto Garrido Trillo
 */
public class Ejemplo14_SVGPath extends Application
{

  @Override

  public void start(Stage stage)
  {
    //Creating a SVGPath object 
    SVGPath svgPath = new SVGPath();

    String path = "M 300 50 L 150 250 L 450 250 z";

    //Setting the SVGPath in the form of string 
    svgPath.setContent(path);

    //Creating a Group object  
    Group root = new Group(svgPath);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage
    stage.setTitle("Drawing a Sphere");

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
