package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 * 
 * @author Roberto Garrido Trillo
 */
public class Ejemplo16_ColorInput extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    ColorInput color = new ColorInput();  
    color.setPaint(Color.RED);        
    color.setHeight(100);  
    color.setWidth(100);  
    color.setX(100);  
    color.setY(100);  
    Rectangle rect = new Rectangle();  
    rect.setEffect(color);  

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(rect);
    // Scene
    Scene scene = new Scene(group, 300, 300, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo16_ColorInput");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

