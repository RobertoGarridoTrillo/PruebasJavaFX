package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 * There are two constructor in the class.
 *
 * Public Glow(): It is the default constructor. It instantiate the class with
 * the default parameters. Public Glow(double level): It creates the instance
 * with the specified level value.
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo20_Glow extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Image img1 = new Image("/main/images/logo.png");
    Image img2 = new Image("/main/images/logo.png");

    ImageView imgview1 = new ImageView(img1);
    ImageView imgview2 = new ImageView(img2);
    Text text1 = new Text();
    Text text2 = new Text();
    text1.setText("Glowing with level 10");
    text2.setText("Not Glowing");
    text1.setX(10);
    text1.setY(300);
    text2.setX(525);
    text2.setY(300);
    text1.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, 
            FontPosture.REGULAR, 16));
    text2.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, 
            FontPosture.REGULAR, 16));
    text1.setFill(Color.RED);
    text2.setFill(Color.RED);
    text1.setStroke(Color.BLACK);
    text2.setStroke(Color.BLACK);
    imgview1.setX(10);
    imgview1.setY(90);
    imgview2.setX(500);
    imgview2.setY(90);
    Glow glow = new Glow();
    glow.setLevel(10);
    imgview1.setEffect(glow);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(imgview1, imgview2, text1, text2);
    // Scene
    Scene scene = new Scene(group, 930, 330, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo20_Glow");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

