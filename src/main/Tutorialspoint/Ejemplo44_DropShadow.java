package main.Tutorialspoint;

/**
 * This class contains nine properties, which are −
 *
 * color − This property is of Color type representing the color of the shadow.
 *
 * blur type − This property is of the type − BlurType and it represents the
 * type of the blur effect used to blur the shadow.
 *
 * radius − This property is of the type double and it represents the radius of
 * the shadow blur kernel.
 *
 * width − This property is of the type double and it represents the width of
 * the shadow blur kernel.
 *
 * height − This property is of the type double and it represents the height of
 * the shadow blur kernel.
 *
 * input − This property is of the type Effect and it represents an input to the
 * shadow effect.
 *
 * spread − This property is of the type double; it represents the spread of the
 * shadow.
 *
 * offsetX − This property is of the type double and it represents the shadow
 * offset in the x direction in pixels.
 *
 * offset − This property is of the type double and it represents the shadow
 * offset in the y direction in pixels.
 *
 * @author Roberto Garrido Trillo
 */
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.BlurType; 
import javafx.scene.effect.DropShadow; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
         
public class Ejemplo44_DropShadow extends Application {
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
      text.setText("Welcome to Happy Land");        
      
      //Setting the color of the text 
      text.setFill(Color.DARKSEAGREEN);       
       
      //Drawing a Circle 
      Circle circle = new Circle();         
      
      //Setting the centre of the circle 
      circle.setCenterX(300.0f); 
      circle.setCenterY(160.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(100.0f); 
       
      //Instantiating the Shadow class 
      DropShadow dropShadow = new DropShadow(); 
      
      //setting the type of blur for the shadow 
      dropShadow.setBlurType(BlurType.GAUSSIAN); 
      
      //Setting color for the shadow 
      dropShadow.setColor(Color.ROSYBROWN); 
      
      //Setting the height of the shadow
      dropShadow.setHeight(5); 
      
      //Setting the width of the shadow 
      dropShadow.setWidth(5); 
      
      //Setting the radius of the shadow 
      dropShadow.setRadius(5); 
      
      //setting the offset of the shadow 
      dropShadow.setOffsetX(3); 
      dropShadow.setOffsetY(2); 
      
      //Setting the spread of the shadow 
      dropShadow.setSpread(12);  
      
      //Applying shadow effect to the text 
      text.setEffect(dropShadow);      
      
      //Applying shadow effect to the circle 
      circle.setEffect(dropShadow); 
          
      //Creating a Group object   
      Group root = new Group(circle, text);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drop Shadow effect example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   } 
   public static void main(String args[]){ 
      launch(args);
   } 
}       


