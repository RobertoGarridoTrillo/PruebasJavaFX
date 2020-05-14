package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo04_Rectangle extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Rectangle rect = new Rectangle(); //instantiating Rectangle   
    rect.setX(20);//setting the X coordinate of upper left, corner of rectangle   
    rect.setY(20);//setting the Y coordinate of upper left, corner of rectangle   
    rect.setWidth(100); //setting the width of rectangle   
    rect.setHeight(100); // setting the height of rectangle   
    // Group
    Group group = new Group(); //creating Group   
    group.getChildren().addAll(rect); //adding rectangle to the //group   
    // Scene
    Scene scene = new Scene(group, 200, 300, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Rectangle Example");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

