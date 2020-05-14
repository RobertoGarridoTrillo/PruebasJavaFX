package main.Tutorialspoint;

/**
 * The class named GaussianBlur of the package javafx.scene.effect represents
 * the Gaussian Blur Effect, this class contains two properties, which are −
 *
 * input − This property is of the type Effect and it represents an input to the
 * box blur effect.
 *
 * radius − This property is of a double type representing the radius with which
 * the Gaussian Blur effect is to be applied. The blur effect is directly
 * proportional to radius.
 *
 * @author Roberto Garrido Trillo
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.effect.GaussianBlur;

public class Ejemplo39_GaussianBlur extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Creating a Text object 
    Text text = new Text();

    //Setting font to the text 
    text.setFont(Font.font(null, FontWeight.BOLD, 40));

    //setting the position of the text 
    text.setX(60);
    text.setY(150);

    //Setting the text to be added. 
    text.setText("Welcome to Crazy Land");

    //Setting the color of the text 
    text.setFill(Color.DARKSEAGREEN);

    //Instantiating the GaussianBlur class
    GaussianBlur gaussianBlur = new GaussianBlur();

    //Setting the radius to apply the Gaussian Blur effect  
    gaussianBlur.setRadius(10.5);

    //Applying Gaussian Blur effect to the text 
    text.setEffect(gaussianBlur);

    //Creating a Group object  
    Group root = new Group(text);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage 
    stage.setTitle("Ejemplo39_GaussianBlur");

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

