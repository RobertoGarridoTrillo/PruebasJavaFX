package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo17_ImageInput extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Image img = new Image("main/images/logo.png");

    ImageInput imginput = new ImageInput();
    imginput.setSource(img);
    imginput.setX(20);
    imginput.setY(50);

    Rectangle rect = new Rectangle();
    rect.setEffect(imginput);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(rect);
    // Scene
    Scene scene = new Scene(group, 500, 300, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo15_ColorAdjust");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

