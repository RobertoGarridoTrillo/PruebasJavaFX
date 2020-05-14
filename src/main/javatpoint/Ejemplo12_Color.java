package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo12_Color extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //x, y, widthX, widthY
    Rectangle rect = new Rectangle(20, 20, 50, 50);
    int red = 20; int green = 125; int blue = 10;
    rect.setFill(Color.rgb(red, green, blue, 0.63));

    Rectangle rect2 = new Rectangle(73, 20, 50, 50);
    rect2.setFill(Color.RED); //passing color name
    
    // the combination of Hue, Saturation and Brightness
    Rectangle rect3 = new Rectangle(126, 20, 50, 50);
    rect3.setFill(Color.hsb(180, 1, 1)); 
    
    // the combination of Hue, Saturation and Brightness
    Rectangle rect4 = new Rectangle(178, 20, 50, 50);
    rect4.setFill(Color.web("#0000FF",1)); //Blue color with explicit alpha
    
    // the combination of Hue, Saturation and Brightness
    Rectangle rect5 = new Rectangle(231, 20, 50, 50);
    rect5.setFill(Color.web("#0000FF")); //Blue color with implicit alpha
    

    // Group
    Group group = new Group(); //creating Group   
    //adding rectangle to the //group 
    group.getChildren().addAll(rect, rect2, rect3, rect4, rect5);
    // Scene
    Scene scene = new Scene(group, 300, 90, Color.GRAY);
    // Stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("Ejemplo12_Color");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

