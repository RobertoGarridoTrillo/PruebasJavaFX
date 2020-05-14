package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo36_Bloom extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Creating a Text object 
    Text text = new Text(80, 150, "Welcome to Happy Land");
    Text text2 = new Text(80, 260, "Welcome to Happy Land");
    
    //Setting font to the text
    text.setFont(Font.font(null, FontWeight.BOLD, 40));
    text2.setFont(Font.font(null, FontWeight.BOLD, 40));

    //Setting the color of the text 
    text.setFill(Color.WHITE);
    text2.setFill(Color.BLUE);

    //Instantiating the Rectangle class 
    Rectangle rectangle = new Rectangle(50.0f, 80.0f, 550.0f, 240.0f);

    //Setting the color of the rectangle 
    rectangle.setFill(Color.TEAL);

    //Instantiating the Bloom class 
    Bloom bloom = new Bloom();

    //setting threshold for bloom 
    bloom.setThreshold(0.0);

    //Applying bloom effect to text 
    text.setEffect(bloom);
    text2.setEffect(bloom);

    //Creating a Group object  
    Group root = new Group(rectangle, text, text2);

    //Creating a scene object 
    Scene scene = new Scene(root, 650, 390);

    //Setting title to the Stage 
    stage.setTitle("Ejemplo36_Bloom");

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

