package main.javatpoint;

/**
 * @author Roberto Garrido Trillo
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ejemplo28_InnerShadow extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub  
    Image img = new Image("main/images/free.png");
    ImageView imgview = new ImageView(img);
    imgview.setFitHeight(100);
    imgview.setFitWidth(350);
    imgview.setX(100);
    imgview.setY(100);
    InnerShadow shadow = new InnerShadow();
    shadow.setBlurType(BlurType.GAUSSIAN);
    shadow.setColor(Color.RED);
    shadow.setHeight(25);
    shadow.setRadius(12);
    shadow.setWidth(20);
    shadow.setChoke(0.9);
    imgview.setEffect(shadow);
    Group root = new Group();
    root.getChildren().add(imgview);
    Scene scene = new Scene(root, 600, 350);
    primaryStage.setScene(scene);
    primaryStage.setTitle("InnerShadow Effect Example");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

