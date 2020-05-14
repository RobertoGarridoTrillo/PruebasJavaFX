package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * The constructor of the class accepts a few parameters. The Syntax of the
 * constructor is given below.
 *
 * public RadialGradient(double focusAngle, double focusDistance, double
 * centerX, double centerY, double radius, boolean proportional, CycleMethod
 * cycleMethod, Stops? stops) *
 *
 * Type Method Description Boolean equals(Object o) Compares two objects Double
 * getCenterX() X coordinate of the circle which is defining the gradient Double
 * getCenterY() Y coordinate of the circle which is defining the gradient
 * CycleMethod getCycleMethod() Defines which cycle method has been applied to
 * LinearGradient. Double getFocusAngle() Angle in degrees between the centre of
 * the gradient and the focus of the position where first color is mapped Double
 * getFocusDistance() Distance between the Centre of the gradient and the focus
 * point of the first color. Double getRadius Radius of the gradient List<Stop>
 * getStops() Defines the way of distributions of colors along the gradient Int
 * hashCode() Returns hash code for the linear gradient object Boolean
 * isOpaque() Check whether the paint is completely opaque or not. Boolean
 * isProprtional() Checks whether the start and end locations are proportional
 * or not. String toString() Convert Gradient object to string.
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo14_RadialGradiant extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Circle C1 = new Circle(200, 150, 100);
    RadialGradient gradient1 = new RadialGradient(
            0, .1, 100, 100, 200, false, CycleMethod.NO_CYCLE,
            new Stop(0, Color.YELLOW),
            new Stop(1, Color.RED));
    C1.setFill(gradient1);
    
    Circle C2 = new Circle(450, 150, 100);
    RadialGradient gradient2 = new RadialGradient(
            0, 0.1, 500, 150, 200, false, CycleMethod.NO_CYCLE,
            new Stop(0, Color.YELLOW),
            new Stop(1, Color.BLUE));
    C2.setFill(gradient2);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(C1, C2);
    // Scene
    Scene scene = new Scene(group, 600, 300, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo14_RadialGradiant");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

