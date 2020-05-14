package main.javaTpoint;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author ROBEG
 */
public class Ejemplo36_Translate_Transition extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub  
    //Creating the circle   
    Circle cir = new Circle(250, 250, 10);

    //setting color and stroke of the cirlce  
    cir.setFill(Color.RED);
    cir.setStroke(Color.BLACK);

    //Instantiating TranslateTransition class   
    ScaleTransition scale = new ScaleTransition();

    //Setting the dimensions for scaling 
    scale.setByY(40.5);
    scale.setByX(40.5);

    //setting the duration for the Translate transition   
    scale.setDuration(Duration.millis(1000));

    //setting cycle count for the Translate transition   
    scale.setCycleCount(500);

    //the transition will set to be auto reversed by setting this to true   
    scale.setAutoReverse(true);

    //setting Circle as the node onto which the transition will be applied  
    scale.setNode(cir);

    //playing the transition   
    scale.play();

    //Configuring Group and Scene   
    Group root = new Group();
    root.getChildren().addAll(cir);
    Scene scene = new Scene(root, 500, 500, Color.WHEAT);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Translate Transition example");
    primaryStage.show();

  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

