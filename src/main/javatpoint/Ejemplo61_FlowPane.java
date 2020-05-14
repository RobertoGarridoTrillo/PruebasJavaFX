package main.javatpoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * There are 8 constructors in the class that are given below.
 *
 * FlowPane() FlowPane(Double Hgap, Double Vgap) FlowPane(Double Hgap, Double
 * Vgap, Node? children) FlowPane(Node... Children) FlowPane(Orientation
 * orientation) FlowPane(Orientation orientation, double Hgap, Double Vgap)
 * FlowPane(Orientation orientation, double Hgap, Double Vgap, Node? children )
 * FlowPane(Orientation orientation, Node... Children)
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo61_FlowPane extends Application
{

  @Override
  public void start(Stage primaryStage)
  {
    primaryStage.setTitle("FlowPane Example");
    FlowPane root = new FlowPane();
    root.setVgap(6);
    root.setHgap(5);
    root.setPrefWrapLength(250);
    root.getChildren().add(new Button("Start"));
    root.getChildren().add(new Button("Stop"));
    root.getChildren().add(new Button("Reset"));
    Scene scene = new Scene(root, 300, 200);

    primaryStage.setScene(scene);
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

