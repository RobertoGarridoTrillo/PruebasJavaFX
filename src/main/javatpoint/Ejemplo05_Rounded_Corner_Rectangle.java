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
public class Ejemplo05_Rounded_Corner_Rectangle extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Rectangle rect=new Rectangle();  
    rect.setX(20);  
    rect.setY(20);  
    rect.setWidth(100);  
    rect.setHeight(100);  
    rect.setArcHeight(35);  
    rect.setArcWidth(35);  
    rect.setFill(Color.RED);  
    
  // Group
    Group group = new Group(); //creating Group   
    group.getChildren().addAll(rect); //adding rectangle to the //group   
    // Scene
    Scene scene = new Scene(group, 200, 300, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo05_Rounded_Corner_Rectangle");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

