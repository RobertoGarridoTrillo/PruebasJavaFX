package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The class contains two constructors given below.
 *
 * public ColorAdjust() : creates the new instance of ColorAdjust with the
 * default parameters.
 *
 * public ColorAdjust(double hue, double saturation, double brightness, double
 * contrast) : Creates the new instance of the ColorAdjust with th especified
 * parameters.
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo15_ColorAdjust extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Image img1 = new Image("/main/images/logo.png");
    Image img2 = new Image("/main/images/logo.png");
    ImageView imgview1 = new ImageView(img1);
    ImageView imgview2 = new ImageView(img2);
    Text text1 = new Text();
    Text text2 = new Text();
    text1.setText("ColorAdjust Effect Applied");
    text2.setText("ColorAdjust Effect Not Applied");
    text1.setX(100);
    text1.setY(250);
    text2.setX(100);
    text2.setY(500);
    text1.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD,
            FontPosture.REGULAR, 16));
    text2.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, 
            FontPosture.REGULAR, 16));
    text1.setFill(Color.RED);
    text2.setFill(Color.RED);
    text1.setStroke(Color.BLACK);
    text2.setStroke(Color.BLACK);
    text1.setStrokeWidth(0.2);
    text2.setStrokeWidth(0.2);

    imgview1.setX(100);
    imgview1.setY(50);
    imgview2.setX(100);
    imgview2.setY(300);
    // creating the instance of the ColorAdjust effect.   
    ColorAdjust c = new ColorAdjust(); 
    c.setBrightness(0.2); // setting the brightness of the color.   
    c.setContrast(0.1); // setting the contrast of the color  
    c.setHue(0.3); // setting the hue of the color  
    c.setSaturation(0.45); // setting the hue of the color.   
    imgview1.setEffect(c); //applying effect on the image  

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(imgview1, imgview2, text1, text2);
    // Scene
    Scene scene = new Scene(group, 600, 600, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo15_ColorAdjust");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

