package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo68_HyperLink extends Application
{

  public static void main(String[] args)
  {
    launch(args);
  }


  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub  
    Hyperlink hp = new Hyperlink("http://www.javatpoint.com");
    StackPane root = new StackPane();
    hp.setOnAction(e -> System.out.println("Link Clicked"));
    root.getChildren().add(hp);
    Scene scene = new Scene(root, 400, 300);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Hyperlink Example");
    primaryStage.show();
  }


}

