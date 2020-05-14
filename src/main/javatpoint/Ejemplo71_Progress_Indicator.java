package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo71_Progress_Indicator extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub  
    ProgressIndicator PI = new ProgressIndicator();

    StackPane root = new StackPane();
    root.getChildren().add(PI);
    Scene scene = new Scene(root, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Progress Indicator Example");
    primaryStage.show();

  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

