package main.Tutorialspoint;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo22_setFill extends Application
{

  // Creating Circle´s Array
  Circle[] circleses = new Circle[4];
  String[] strings =
  {
    "setFill(Color.RED)", "setFill(Color.CYAN)", "setFill(Color.YELLOW)",
    "setFill(Color.BROWN)"
  };
  Text[] texts = new Text[4];

  @Override
  public void start(Stage stage)
  {
    setCircles();

    setStrokes();

    //Creating a Group object  
    Group root = new Group(circleses[0], circleses[1],
            circleses[2], circleses[3], texts[0], texts[1],
            texts[2], texts[3]);

    //Creating a scene object 
    Scene scene = new Scene(root, 850, 300);
    //Setting title to the Stage 
    stage.setTitle("setFill");

    //Adding scene to the stage 
    stage.setScene(scene);

    //Displaying the contents of the stage 
    stage.show();
  }


  /**
   * Setting the strokes
   */
  private void setStrokes()
  {
    circleses[0].setStroke(Color.RED);
    circleses[0].setStrokeWidth(8);
    circleses[0].setStrokeType(StrokeType.OUTSIDE);

    circleses[1].setStroke(Color.CYAN);
    circleses[1].setStrokeWidth(8);
    circleses[1].setStrokeType(StrokeType.OUTSIDE);
   
    circleses[2].setStroke(Color.YELLOW);
    circleses[2].setStrokeWidth(8);
    circleses[2].setStrokeType(StrokeType.OUTSIDE);


    circleses[3].setStroke(Color.BROWN);
    circleses[3].setStrokeWidth(8);
    circleses[3].setStrokeType(StrokeType.OUTSIDE);

  }


  /* *
   *   Drawing four Circle with the texts
   */
  private void setCircles()
  {

    double j = 130;
    for (int i = 0; i <= 3; i++)
    {
      circleses[i] = new Circle();
      texts[i] = new Text();
      //Setting the properties of the circle
      circleses[i].setCenterX(j);
      circleses[i].setCenterY(135.0f);
      circleses[i].setRadius(80.0f);
      circleses[i].setFill(Color.BLUE);
              
      //Setting the properties of the text
      setFuente("Verdana", texts[i], 12);
      texts[i].setX(j - 80);
      texts[i].setY(260);
      texts[i].setFill(Color.RED);
      texts[i].setText(strings[i]);
      System.out.println(texts[i]);

      j += 200;
    }
  }


  /**
   * Check if the font exits
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
                FontWeight.BOLD, FontPosture.ITALIC, size));
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

