package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo10_Cubic_Curve extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    CubicCurve c = new CubicCurve();
    c.setStartX(20);
    c.setStartY(100);
    c.setControlX1(300);
    c.setControlX2(200);
    c.setControlY1(100);
    c.setControlY2(90);
    c.setEndX(100);
    c.setEndY(5300);
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
    primaryStage.setTitle("Ejemplo10_Cubic_Curve");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

