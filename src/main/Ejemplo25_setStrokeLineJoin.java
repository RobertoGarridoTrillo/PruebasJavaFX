package main;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.StrokeLineJoin;
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
public class Ejemplo25_setStrokeLineJoin extends Application
{

  // Creating SVGPaths´ Array
  SVGPath[] SVGPaths = new SVGPath[4];
  String[] path = new String[4];
  String[] strings =
  {
    "by default(MITER)", 
    "setStrokeLineJoin(MITER)", 
    "setStrokeLineJoin(ROUND)",
    "setStrokeLineJoin(BEVEL)"
  };
  Text[] texts = new Text[4];

  @Override
  public void start(Stage stage)
  {
    setPoly();

    setStrokes();

    //Creating a Group object  
    Group root = new Group(SVGPaths[0], SVGPaths[1], SVGPaths[2], SVGPaths[3],
            texts[0], texts[1],texts[2], texts[3]);

    //Creating a scene object 
    Scene scene = new Scene(root, 850, 300);
    //Setting title to the Stage 
    stage.setTitle("Stroke Line Join");

    //Adding scene to the stage 
    stage.setScene(scene);

    //Displaying the contents of the stage 
    stage.show();
  }
  
  /* *
   *   Drawing four polylines with the texts
   */
  private void setPoly()
  {
    //Creating a String path 
    path[0] = "M 120 50 L 70 200 L 170 200 z";
    path[1] = "M 340 50 L 290 200 L 390 200 z";
    path[2] = "M 540 50 L 490 200 L 590 200 z";
    path[3] = "M 730 50 L 680 200 L 790 200 z";

    // Setting the polylines and text
    double j = 130;
    for (int i = 0; i <= 3; i++)
    {
      // Creating a SVGPath object
      SVGPaths[i] = new SVGPath();
      //Setting the SVGPath in the form of string 
      SVGPaths[i].setContent(path[i]);
      texts[i] = new Text();

      //Setting the properties of the text
      setFuente("Verdana", texts[i], 12);
      texts[i].setX(j - 80);
      texts[i].setY(260);
      texts[i].setFill(Color.RED);
      texts[i].setText(strings[i]);
      j += 200;
    }
  }


  /**
   * Setting the strokes
   */
  private void setStrokes()
  {
    for (int i = 0; i <= 3; i++)
    {
    SVGPaths[i].setStroke(Color.RED);
    SVGPaths[i].setStrokeWidth(8);
    SVGPaths[i].setStrokeType(StrokeType.OUTSIDE);
    }

    SVGPaths[1].setStrokeLineJoin(StrokeLineJoin.MITER);
    SVGPaths[2].setStrokeLineJoin(StrokeLineJoin.ROUND);
    SVGPaths[3].setStrokeLineJoin(StrokeLineJoin.BEVEL);
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

