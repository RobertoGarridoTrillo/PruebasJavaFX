package main.Tutorialspoint;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo35_Blend extends Application
{

  private int contador = 0;
  private String[] s ={
    "Add    The color components of the top input are added to that from the "
          + "bottom input.",
    "Blue 	Only Blue components of the bottom input gets replaced by the blue component of top input.",
    "COLOR_BURN 	The bottom input color gets inverted and divided by the top input color components. The result is again inverted to get the output color. ",
    "COLOR_DODGE 	The top color components gets inverted and divide the bottom color components to produce the output color. ",
    "DARKEN 	The color which is darker of the two input component colors is selected to produce the resulting color. ",
    "DIFFERENCE 	The darker of the two input color is subtracted from the lighter color to produce the resulting color. ",
    "EXCLUSION 	The two input color components are multiplied and doubled and then subtracted from the sum of bottom color components to produce the desired color. ",
    "GREEN 	The green component from the bottom input is replaced by the green input of top component. ",
    "HARD_LIGHT 	The input color components are either multiplied or screened depending upon the bottom color. 	JavaFX Blend Mode HARD LIGHT Output",
    "LIGHTEN 	The lighter color of the two color components is produced as output. ",
    "MULTIPLY 	Both the color components get multiplied to produce the output color. ",
    "OVERLAY 	The input color components gets either screened or multiplied depending upon the bottom color. ",
    "RED 	The red components of bottom input gets replaced with the red components of top input. 	JavaFX Blend Mode RED Output",
    "SCREEN 	Both color components are inverted, multiplied and again inverted to produce the desired result.",
    "SOFT_LIGHT 	The input color components become lighten or darken. ",
    "SRC_ATOP 	The part of the top input that is lying over the bottom input gets blended. ", 
    "SRC_OVER 	Top input gets blended over bottom input."
  };

  @Override
  public void start(Stage primaryStage)
  {
    // Creating a cicle
    Circle circle = new Circle(150, 200, 120);
    circle.setFill(Color.RED);

    // Creating a ColorInput
    ColorInput colorInput = new ColorInput(70, 20, 160, 150, Color.LIMEGREEN);

    // Creating a label
    Label label = new Label();
    label.setWrapText(true);
    label.setMaxWidth(295);

    // Setting properties for the label
    label.setTranslateX(5);
    label.setTranslateY(350);

    // Creating the play button   
    Button btn = new Button();

    //Setting properties for the play button   
    btn.setText("Play");
    btn.setTranslateX(135);
    btn.setTranslateY(330);

    // Çreating an objet Blend
    Blend blend = new Blend();
    blend.setTopInput(colorInput);

    // defining the convenience method to register the event handler 
    // to handle the Action event.      
    btn.setOnAction(new EventHandler<ActionEvent>()
    {

      @Override
      public void handle(ActionEvent event)
      {
        contador++;
        System.out.println(contador);
        switch (contador) {
          case 1: {blend.setMode(BlendMode.ADD);label.setText(s[0]);break;}
          case 2: blend.setMode(BlendMode.BLUE);label.setText(s[1]);break;
          case 3: blend.setMode(BlendMode.COLOR_BURN);label.setText(s[2]);break;
          case 4: blend.setMode(BlendMode.COLOR_DODGE);label.setText(s[3]);break;
          case 5: blend.setMode(BlendMode.DARKEN);label.setText(s[4]);break;
          case 6: blend.setMode(BlendMode.DIFFERENCE);label.setText(s[5]);break;
          case 7: blend.setMode(BlendMode.EXCLUSION);label.setText(s[6]);break;
          case 8: blend.setMode(BlendMode.GREEN);label.setText(s[7]);break;
          case 9: blend.setMode(BlendMode.HARD_LIGHT);label.setText(s[8]);break;
          case 10: blend.setMode(BlendMode.LIGHTEN);label.setText(s[9]);break;
          case 11: blend.setMode(BlendMode.MULTIPLY);label.setText(s[10]);break;
          case 12: blend.setMode(BlendMode.OVERLAY);label.setText(s[11]);break;
          case 13: blend.setMode(BlendMode.RED);label.setText(s[12]);break;
          case 14: blend.setMode(BlendMode.SCREEN);label.setText(s[13]);break;
          case 15: blend.setMode(BlendMode.SOFT_LIGHT);label.setText(s[14]);break;
          case 16: blend.setMode(BlendMode.SRC_ATOP);label.setText(s[15]);break;
          case 17: blend.setMode(BlendMode.SRC_OVER);label.setText(s[16]);
          contador = 0;break;
          }

        circle.setEffect(blend);
      }


    }
    );

    // Creating a Group
    Group root = new Group(circle);
    Scene scene = new Scene(root, 300, 450);

    root.getChildren().addAll(btn, label);
    primaryStage.setTitle("Blend Example");
    primaryStage.setScene(scene);

    primaryStage.show();

  }


  ;


  


  


  


  


  public static void main(String args[])
  {
    launch(args);
  }


}

