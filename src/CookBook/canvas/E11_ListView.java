package CookBook.canvas;

/**
 *
 * @author Roberto Garrido Trillo
 */
import java.text.Normalizer;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E11_ListView extends Application {
// Create the Selection Label

   Label selectionLbl = new Label("Your selection: None");

   public static void main(String[] args) {
      Application.launch(args);
   }


   @Override
   public void start(Stage stage) {
// Create the ListView
      ListView<String> cars = new ListView<String>();

// Add Items to the ListView
      cars.getItems().addAll("Fórd", "Aüdi", "FeRRari", "Porsche");

// Select the first car from the list
      cars.getSelectionModel().selectFirst();

// Add ChangeListener to the ListView
      cars.getSelectionModel().selectedItemProperty()
              .addListener(new ChangeListener<String>() {
                 public void changed(ObservableValue<? extends String> ov,
                         String oldValue, String newValue) {
                    selectionLbl.setText("Your selection: " + newValue);
                 }


              });

// Create the GridPane
      GridPane root = new GridPane();

// Set the horizontal and vertical spacing between columns and rows
      root.setVgap(10);
      root.setHgap(10);

// Add ListView and Label to the GridPane
      root.addRow(0, cars);
      root.addRow(1, selectionLbl);
// Set the Size of the GridPane
      root.setMinSize(300, 200);

      root.setStyle("-fx-padding: 10;" +
              "-fx-border-style: solid inside;" +
              "-fx-border-width: 2;" +
              "-fx-border-insets: 5;" +
              "-fx-border-radius: 5;" +
              "-fx-border-color: blue;");

// Create the Scene
      Scene scene = new Scene(root);
// Add the scene to the Stage
      stage.setScene(scene);
// Set the title of the Stage
      stage.setTitle("A ListView Example");
// Display the Stage
      stage.show();
   }


}

