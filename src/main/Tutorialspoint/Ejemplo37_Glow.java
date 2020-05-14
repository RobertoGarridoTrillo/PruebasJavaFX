package main.Tutorialspoint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo37_Glow extends Application
{

  @Override
  public void start(Stage stage)
  {
    //Creating an image 
    Image image = new Image("main/images/logo.png");
    Image image2 = new Image("main/images/logo.png");

    //Setting the image view 
    ImageView imageView = new ImageView(image);
    ImageView imageView2 = new ImageView(image2);

    //setting the fit width of the image view 
    imageView.setFitWidth(400);
    imageView2.setFitWidth(400);

    //Setting the preserve ratio of the image view 
    imageView.setPreserveRatio(true);
    imageView2.setPreserveRatio(true);
    
    imageView.setX(10);    
    imageView.setY(10);
    imageView2.setX(10);
    imageView2.setY(200);

    //Instantiating the Glow class 
    Glow glow = new Glow();

    //setting level of the glow effect 
    glow.setLevel(0.9);

    //Applying bloom effect to text 
    imageView.setEffect(glow);

    //Creating a Group object  
    Group root = new Group(imageView, imageView2);

    //Creating a scene object 
    Scene scene = new Scene(root, 410, 400);

    //Setting title to the Stage 
    stage.setTitle("Ejemplo37_Glow");

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

