package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo27_setStrokeMiterLimit extends Application
{
  @Override
  public void start(Stage stage)
  {
      Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
      Text label2 = new Text("Miter Limit: 3");
      label2.setFont(font);
      label2.setX(50.0);
      label2.setY(275.0);
      Polygon shape1 = new Polygon(100.0, 50.0, 50.0, 200.0, 150.0, 200.0);
      shape1.setStroke(Color.BLUE);
      shape1.setStrokeWidth(20);
      shape1.setStrokeLineJoin(StrokeLineJoin.MITER);
      shape1.setStrokeMiterLimit(3);
      Text label3 = new Text("Miter Limit: 4");
      label3.setFont(font);
      label3.setX(250.0);
      label3.setY(275.0);
      Polygon shape2 = new Polygon(300.0, 50.0, 250.0, 200.0, 350.0, 200.0);
      shape2.setStroke(Color.BLUE);
      shape2.setStrokeWidth(20.0);
      shape2.setStrokeLineJoin(StrokeLineJoin.MITER);
      shape2.setStrokeMiterLimit(4);
      Text label4 = new Text("Miter Limit: 0.4");
      label4.setFont(font);
      label4.setX(430.0);
      label4.setY(275.0);
      Polygon shape3 = new Polygon(490.0, 50.0, 440, 200.0, 540.0, 200.0);
      shape3.setStroke(Color.BLUE);
      shape3.setStrokeWidth(20.0);
      shape3.setStrokeLineJoin(StrokeLineJoin.MITER);
      shape3.setStrokeMiterLimit(0.4);
      //Creating a Group object
      Group root = new Group(label2, label3, label4, shape1, shape2, shape3);
      //Creating a scene object
      Scene scene = new Scene(root, 595, 310);
      //Setting title to the Stage
      stage.setTitle("Stroke Miter Limit");
      //Adding scene to the stage
      stage.setScene(scene);
      //Displaying the contents of the stage
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}
