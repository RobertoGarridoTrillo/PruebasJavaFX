package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo30_setFont extends Application
{

  @Override
  public void start(Stage stage) throws Exception
  {
    //Creating a Text object 
    Text text = new Text();

    //Setting font to the text 
    text.setFont(Font.font("verdana", FontWeight.BOLD, 
            FontPosture.REGULAR, 50));
    
    //Setting the text to be added. 
    text.setText("Hi, how are you");

    //setting the position of the text 
    text.setX(50);
    text.setY(130);

    //Setting the color 
    text.setFill(Color.BROWN);

    //Setting the Stroke  
    text.setStrokeWidth(2);

    // Setting the stroke color
    text.setStroke(Color.BLUE);

    //Creating a Group object  
    Group root = new Group(text);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage 
    stage.setTitle("setFont");

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

