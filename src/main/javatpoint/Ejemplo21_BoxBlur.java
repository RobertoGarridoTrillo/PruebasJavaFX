package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Roberto Garrido Trillo
 */
public class Ejemplo21_BoxBlur extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Text text = new Text();
    text.setText("Welcome to Crazy Land");
    text.setX(80);
    text.setY(100);
    text.setFont(Font.font("Calibri", FontWeight.BLACK, 
            FontPosture.ITALIC, 30));
    text.setFill(Color.RED);
    text.setStroke(Color.BLACK);
    text.setUnderline(true);
    BoxBlur b = new BoxBlur();
    b.setHeight(5);
    b.setWidth(2);
    b.setIterations(1);
    text.setEffect(b);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(text);
    // Scene
    Scene scene = new Scene(group, 450, 200, Color.WHITE);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo21_BoxBlur");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

