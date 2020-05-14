package main.Tutorialspoint;

import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.Lighting; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
import javafx.application.Application;

/**
 * this class contains ten properties, which are −
 *
 * bumpInput − This property is of the type Effect and it represents an optional
 * bump map input to the lighting effect.
 *
 * contentInput − This property is of the type Effect and it represents a
 * content input to the lighting effect.
 *
 * diffuseConstant − This property is of the type double and it represents the
 * diffuse constant of the light.
 *
 * SpecularConstant − This property is of the type double and it represents the
 * specular constant of the light.
 *
 * SpecularExponent − This property is of the type double and it represents the
 * specular exponent of the light.
 *
 * SurfaceScale − This property is of the type double and it represents the
 * surface scale factor of the light.
 *
 * @author Roberto Garrido Trillo
 */
         
public class Ejemplo46_Lighting_Default_Source extends Application { 
   @Override 
   public void start(Stage stage) {  
      //Creating a Text object 
      Text text = new Text();       
      
      //Setting font to the text 
      text.setFont(Font.font(null, FontWeight.BOLD, 40));       
      
      //setting the position of the text 
      text.setX(60); 
      text.setY(50); 
      
      //Setting the text to be embedded. 
      text.setText("Welcome to Tutorialspoint");       
      
      //Setting the color of the text 
      text.setFill(Color.RED);   
       
      //Drawing a Circle 
      Circle circle = new Circle();         
      
      //Setting the center of the circle
      circle.setCenterX(300.0f); 
      circle.setCenterY(160.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(100.0f); 
      
      //setting the fill color of the circle 
      circle.setFill(Color.CORNFLOWERBLUE);   
       
      //Instantiating the Lighting class  
      Lighting lighting = new Lighting(); 
  
      //Applying lighting effect to the text 
      text.setEffect(lighting);      
      
      //Applying lighting effect to the circle 
      circle.setEffect(lighting); 
         
      //Creating a Group object  
      Group root = new Group(text,circle);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Ejemplo46_Lighting_Default_Source"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}       


