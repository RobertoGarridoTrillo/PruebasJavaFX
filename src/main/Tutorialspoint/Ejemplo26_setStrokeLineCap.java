package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo26_setStrokeLineCap extends Application
{

  @Override
  public void start(Stage stage)
  {
    Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
    Text label1 = new Text("Normal Line");
    label1.setFont(font);
    label1.setX(260.0);
    label1.setY(90.0);
    Line line1 = new Line(250.0, 50.0, 350.0, 50.0);
    Text label2 = new Text("Line Cap: BUTT");
    label2.setFont(font);
    label2.setX(50.0);
    label2.setY(235.0);
    Line line2 = new Line(50.0, 200.0, 150.0, 200.0);
    line2.setStroke(Color.DARKBLUE);
    line2.setStrokeWidth(10.0);
    line2.setStrokeType(StrokeType.CENTERED);
    line2.setStrokeLineCap(StrokeLineCap.BUTT);
    Text label3 = new Text("Line Cap: SQUARE");
    label3.setFont(font);
    label3.setX(245.0);
    label3.setY(235.0);
    Line line3 = new Line(250.0, 200.0, 350.0, 200.0);
    line3.setStrokeWidth(10.0);
    line3.setStroke(Color.DARKBLUE);
    line3.setStrokeLineCap(StrokeLineCap.SQUARE);
    Text label4 = new Text("Line Cap: ROUND");
    label4.setFont(font);
    label4.setX(440.0);
    label4.setY(235.0);
    Line line4 = new Line(440, 200.0, 540.0, 200.0);
    line4.setStrokeWidth(10.0);
    line4.setStroke(Color.DARKBLUE);
    line4.setStrokeLineCap(StrokeLineCap.ROUND);
    //Creating a Group object
    Group root = new Group(label1, label2, label3, label4, line1, line2, line3, line4);
    //Creating a scene object
    Scene scene = new Scene(root, 595, 310);
    //Setting title to the Stage
    stage.setTitle("Stroke Line Cap Example");
    //Adding scene to the stage
    stage.setScene(scene);
    //Displaying the contents of the stage
    stage.show();
  }


  public static void main(String args[])
  {
    launch(args);
  }


}

