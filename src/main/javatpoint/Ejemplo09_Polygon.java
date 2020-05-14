package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo09_Polygon extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Polygon polygon = new Polygon();  
    polygon.getPoints().addAll(new Double[]{  
        0.0, 0.0,  
        100.0, 200.0,  
        200.0, 100.0 });  
    
     Polygon polygon02 = new Polygon(400.0,0.0, 300.0,200.0, 200.0, 100.0);  

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(polygon, polygon02);
    // Scene
    Scene scene = new Scene(group, 400, 250, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo09_Polygon");
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }


}

