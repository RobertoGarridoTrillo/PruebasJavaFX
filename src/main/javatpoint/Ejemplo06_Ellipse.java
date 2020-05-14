package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo06_Ellipse extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Ellipse ellipse = new Ellipse();
    ellipse.setCenterX(100);
    ellipse.setCenterY(100);
    ellipse.setRadiusX(50);
    ellipse.setRadiusY(80);

    // Group
    Group group = new Group(); //creating Group   
    group.getChildren().addAll(ellipse); //adding rectangle to the //group   
    // Scene
    Scene scene = new Scene(group, 200, 300, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo06_Ellipse");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

