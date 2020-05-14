package main.javatpoint;

/**
 *
 * @author Roberto Garrido Trillo
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejemplo59_StackPane extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Button btn1 = new Button("Button 1 on bottom ");
    Button btn2 = new Button("Button 2 on top");
    StackPane root = new StackPane();
    Scene scene = new Scene(root, 200, 200);
    root.getChildren().addAll(btn1, btn2);
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

