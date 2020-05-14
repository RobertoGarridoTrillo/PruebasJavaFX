package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * The Constructor of this class accepts five parameters:
 *
 * new LinearGradient(startX, startY, endX, endY, Proportional, CycleMethod,
 * stops)
 *
 * (startX,startY): represents x and y coordinates of the starting point of the
 * gradient color.
 *
 * (endX,endY): represents x and y coordinates of the ending point of the
 * gradient color.
 *
 * Proportional: This is a boolean type property. If this is true then the
 * starting and ending point of the gradient color will become proportional.
 *
 * CycleMethod: This defines the cycle method applied to the gradient.
 *
 * Stops: this defines the color distribution along the gradient.
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo13_LinearGradient extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    VBox root = new VBox();
    Stop[] stops = new Stop[]{
      new Stop(0, Color.GREEN),
      new Stop(1, Color.BLUE)};
    LinearGradient linear
            = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

    Rectangle rect = new Rectangle(50, 50, 300, 100);
    rect.setFill(linear);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(rect);
    // Scene
    Scene scene = new Scene(group, 400, 200, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo13_LinearGradient");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

