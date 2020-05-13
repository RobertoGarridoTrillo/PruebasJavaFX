package main;

import java.util.List;
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
 * FontWeigh BLACK represents Black font weight (900). BOLD represents Bold font
 * weight (700). EXTRA_BOLD represents 'Extra Bold' font weight (800).
 * EXTRA_LIGHT represents 'Extra Light' font weight (200). LIGHT represents
 * Light font weight (300). MEDIUM represents Medium font weight (500). NORMAL
 * represents Normal font weight (400). SEMI_BOLD represents 'Demi Bold' font
 * weight (600). THIN represents Thin font weight (100).
 *
 * FontPosture Italic Regular
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo04_Text extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //Creating a Text object 
    Text text = new Text();
    final String TYPE_TEXT = "Verdana";

    setFuente(TYPE_TEXT, text, 12);

    //Setting the text to be added. 
    text.setText("Hello World");

    //creating a Group object (node Root)
    Group root = new Group(text);

    //Creating a Scene by passing the group object, height and width       
    Scene scene = new Scene(root, 600, 300);

    // Setting the coordinate and color of the stage    
    text.setX(50);
    text.setY(150);
    text.setFill(Color.RED);

    //Setting the title to Stage. 
    primaryStage.setTitle("Text");

    //Adding the scene to Stage 
    primaryStage.setScene(scene);

    //Displaying the contents of the stage 
    primaryStage.show();
  }


  /**
   *
   * @param searchedFont El tipo de texto buscado
   * @param text An objet of Text type
   */
  private void setFuente(final String searchedFont, Text text, int size)
  {
    // Extracting the list of intaled fonts
    List<String> listFonts = Font.getFamilies();
    // Checking the list with the searched font
    for (String font : listFonts)
    {
      if (searchedFont.equals(font))
      {
        text.setFont(Font.font(searchedFont,
                FontWeight.BOLD, FontPosture.ITALIC, size * 6.5));
        break;
      } else
      {
        text.setFont(Font.font(size));
      }
    }

  }


  public static void main(String args[])
  {
    launch(args);
  }


}

