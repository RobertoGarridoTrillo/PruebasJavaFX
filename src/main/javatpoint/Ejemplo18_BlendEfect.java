package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo18_BlendEfect extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Circle circle = new Circle(150, 200, 120);
    circle.setFill(Color.RED);
    Blend blend = new Blend();
    ColorInput color = new ColorInput(70, 20, 160, 150, Color.LIMEGREEN);
    blend.setTopInput(color);
    blend.setMode(BlendMode.ADD);
    circle.setEffect(blend);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(circle);
    // Scene
    Scene scene = new Scene(group, 300, 400, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo18_BlendEfect");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

