package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo06_Rectangle extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //Drawing a Rectangle 
    Rectangle rectangle = new Rectangle();

    //Setting the properties of the rectangle 
    rectangle.setX(150.0f);
    rectangle.setY(75.0f);
    rectangle.setWidth(300.0f);
    rectangle.setHeight(150.0f);

    //Creating a Group object  
    Group root = new Group(rectangle);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage 
    primaryStage.setTitle("Drawing a Rectangle");

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

