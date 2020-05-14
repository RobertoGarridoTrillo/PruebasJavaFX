package main.Tutorialspoint;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo05_Shape_Path extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //creating a Group object (node Root)
    Group root = new Group();

    //Creating a Path 
    Path path = new Path();

    //Moving to the starting point 
    MoveTo moveTo = new MoveTo(108, 71);

    //Creating 1st line 
    LineTo line1 = new LineTo(321, 161);

    //Creating 2nd line 
    LineTo line2 = new LineTo(126, 232);

    //Creating 3rd line 
    LineTo line3 = new LineTo(232, 52);

    //Creating 4th line 
    LineTo line4 = new LineTo(269, 250);

    //Creating 4th line 
    LineTo line5 = new LineTo(108, 71);

    //Adding all the elements to the path 
    path.getElements().add(moveTo);
    path.getElements().addAll(line1, line2, line3, line4, line5);

    //Retrieving the observable list object 
    ObservableList list = root.getChildren();

    //Setting the text object as a node to the group object 
    list.add(path);

    //Creating a Scene by passing the group object, height and width   
    Scene scene = new Scene(root, 600, 300);

    //Setting the title to Stage. 
    primaryStage.setTitle("Shape Path");

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

