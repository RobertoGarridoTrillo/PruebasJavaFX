package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo08_Circle extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Circle circle = new Circle();  
    circle.setCenterX(200);  
    circle.setCenterY(150);  
    circle.setRadius(100);  
    circle.setFill(Color.RED);  
    
    Circle circle2 = new Circle(200, 400, 100, Color.BLUE);  
    
    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(circle, circle2);
    // Scene
    Scene scene = new Scene(group, 400, 600, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo08_Circle");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

