package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo11_Quad_Curve extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    QuadCurve c = new QuadCurve();  
    c.setStartX(70);  
    c.setStartY(30);  
    c.setControlX(250);  
    c.setControlY(50);  
    c.setEndX(250);  
    c.setEndY(300);  
    c.setFill(Color.RED);  
    c.setEffect(new DropShadow());  

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(c);
    // Scene
    Scene scene = new Scene(group, 300, 400, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo11_Quad_Curve");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

