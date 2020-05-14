package main.javatpoint;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo01_HelloWorld extends Application
{

  @Override
  public void start(Stage stage) throws Exception
  {
    // Creating  button
    Button button = new Button("Say, \"Hello World");
    // Creating an event for the button
    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent t)
      {
        System.out.println("Hello world");
      }
      
    });
    // Creating layout
    StackPane root = new StackPane();
    // adding childrens nodes to Stackpane
    root.getChildren().add(button);
    // Creating an scene
    Scene scene = new Scene(root, 600, 400);
    // Preparing the stage
    stage.setScene(scene);
    stage.setTitle("Hello World");
    stage.show();
  }

     public static void main (String[] args)  
    {  
        launch(args);  
    }  
}

