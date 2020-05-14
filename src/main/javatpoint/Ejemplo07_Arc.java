package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo07_Arc extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Arc arcChord = new Arc();
    arcChord.setCenterX(40);
    arcChord.setCenterY(100);
    arcChord.setRadiusX(50);
    arcChord.setRadiusY(80);
    arcChord.setStartAngle(30);
    arcChord.setLength(70);
    arcChord.setType(ArcType.CHORD);
    arcChord.setFill(Color.RED);

    Arc arcOpen = new Arc(100, 100, 50, 80, 30, 70);
    arcOpen.setType(ArcType.CHORD);
    arcOpen.setFill(Color.BLUE);
    
    Arc arcRound = new Arc(180, 100, 50, 80, 30, 70);
    arcRound.setType(ArcType.ROUND);
    arcRound.setFill(Color.GREEN);

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(arcChord, arcOpen, arcRound);
    // Scene
    Scene scene = new Scene(group, 250, 150, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo07_Arc");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

