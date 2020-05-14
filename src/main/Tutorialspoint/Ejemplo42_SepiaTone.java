package main.Tutorialspoint;

import javafx.application.Application;

/**
 * this class contains two properties, which are −
 *
 * level − This property is of double type representing the intensity of this
 * effect. The range of this property is 0.0 to 1.0.
 *
 * input − This property is of the type effect and it represents an input to the
 * sepia tone effect.
 *
 * @author Roberto Garrido Trillo
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Ejemplo42_SepiaTone extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Creating an image 
    Image image = new Image("/main/images/logo.png");

    //Setting the image view 
    ImageView imageView = new ImageView(image);

    //Setting the position of the image  
    imageView.setX(150);
    imageView.setY(0);

    //setting the fit height and width of the image view 
    imageView.setFitHeight(300);
    imageView.setFitWidth(400);

    //Setting the preserve ratio of the image view 
    imageView.setPreserveRatio(true);

    //Instanting the SepiaTone class 
    SepiaTone sepiaTone = new SepiaTone();

    //Setting the level of the effect 
    sepiaTone.setLevel(0.8);

    //Applying SepiaTone effect to the image 
    imageView.setEffect(sepiaTone);

    //Creating a Group object  
    Group root = new Group(imageView);

    //Creating a scene object 
    Scene scene = new Scene(root, 600, 300);

    //Setting title to the Stage 
    stage.setTitle("Sepia tone effect example");

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

