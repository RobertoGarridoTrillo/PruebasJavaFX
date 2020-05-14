package main.javatpoint;

/**
 * @author Roberto Garrido Trillo
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ejemplo25_SepiaTone extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub  
    Image img1 = new Image("/main/images/logo.png");
    Image img2 = new Image("/main/images/logo.png");
    ImageView imgview1 = new ImageView(img1);
    ImageView imgview2 = new ImageView(img2);
    Text text1 = new Text();
    Text text2 = new Text();
    text1.setText("Original Image");
    text2.setText("SepiaTone Effect Applied");
    text1.setX(70);
    text1.setY(300);
    text2.setX(505);
    text2.setY(300);
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

    imgview1.setX(70);
    imgview1.setY(90);
    imgview2.setX(500);
    imgview2.setY(90);
    SepiaTone sepia = new SepiaTone();
    sepia.setLevel(0.75);
    imgview2.setEffect(sepia);
    Group root = new Group();
    root.getChildren().addAll(imgview1, imgview2, text1, text2);
    Scene scene = new Scene(root, 900, 350);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Sepia Tone Effect Example");
    primaryStage.show();

  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

