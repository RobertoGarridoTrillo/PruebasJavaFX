package CookBook.canvas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E09_ChoiceBox extends Application
{

  public static void main(String[] args)
  {
    Application.launch(args);
  }


  @Override
  public void start(Stage stage)
  {

// Create the Label for the Car
    Label carLbl = new Label("Car:");
// Create a ChoiceBox for cars
    ChoiceBox<String> cars = new ChoiceBox<>();
// Add the items to the ChoiceBox
    cars.getItems().addAll("Ford", "Audi", "Ferrari", "Porsche");
// Create the Selection Message Label
    Label selectionMsgLbl = new Label("Your selection:");
// Create the Selection Value Label
    Label selectedValueLbl = new Label();
// Bind the value property to the text property of the Label
    selectedValueLbl.textProperty().bind(cars.valueProperty());
// Display controls in a GridPane
    GridPane root = new GridPane();
// Set the spacing between columns and rows
    root.setVgap(10);
    root.setHgap(10);
// Add the Labels and the ChoiceBox to the GridPane
    root.addRow(0, carLbl, cars);
    root.addRow(1, selectionMsgLbl, selectedValueLbl);
// Set the Size of the GridPane
    root.setMinSize(350, 250);

    root.setStyle("-fx-padding: 10;"
            + "-fx-border-style: solid inside;"
            + "-fx-border-width: 2;"
            + "-fx-border-insets: 5;"
            + "-fx-border-radius: 5;"
            + "-fx-border-color: blue;");
// Create the Scene
    Scene scene = new Scene(root);
// Add the scene to the Stage
    stage.setScene(scene);
// Set the title of the Stage
    stage.setTitle("A ChoiceBox Example");
// Display the Stage
    stage.show();
  }


}

