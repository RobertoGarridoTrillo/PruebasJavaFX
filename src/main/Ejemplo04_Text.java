package main;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;

import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo04_Text extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //Creating a Text object 
    Text text = new Text();

    //Setting font to the text 
    text.setFont(new Font(45));

    //setting the position of the text 
    text.setX(50);
    text.setY(150);

    //Setting the text to be added. 
    text.setText("Hello World");

    //creating a Group object (node Root)
    Group root = new Group(text);

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

