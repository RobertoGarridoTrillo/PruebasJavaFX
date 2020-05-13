package main;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo02_Straght_Line extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //creating a Group object (node Root)
    Group root = new Group();

    // Creating a line object 
    Line line = new Line();

    //Setting the properties to a line 
    line.setStartX(100.0);
    line.setStartY(150.0);
    line.setEndX(500.0);
    line.setEndY(150.0);

    //Retrieving the observable list object 
    ObservableList list = root.getChildren();

    //Setting the text object as a node to the group object 
    list.add(line);

    //Creating a Scene by passing the group object, height and width   
    Scene scene = new Scene(root, 600, 300);

    //Setting the title to Stage. 
    primaryStage.setTitle("Straight line");

    //Adding the scene to Stage 
    primaryStage.setScene(scene);

    //Displaying the contents of the stage 
    primaryStage.show();
  }


  public static void main(String args[])
  {
    launch(args);
  }


}

