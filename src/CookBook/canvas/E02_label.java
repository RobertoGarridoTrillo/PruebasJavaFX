package CookBook.canvas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E02_label extends Application
{

  @Override
  public void start(Stage stage)
  {
    // Create the Text Fields
    TextField firstNameFld = new TextField();
    TextField lastNameFld = new TextField();

    // Create the Labels
    Label firstNameLbl = new Label("_First Name:");
    Label lastNameLbl = new Label("_Last Name:");

    // Bind the Label to the according Field
    firstNameLbl.setLabelFor(firstNameFld);
    // Set mnemonic parsing to the Label
    firstNameLbl.setMnemonicParsing(true);
    // Bind the Label to the according Field
    lastNameLbl.setLabelFor(lastNameFld);
    // Set mnemonic parsing to the Label
    lastNameLbl.setMnemonicParsing(true);
    
    // Create the GridPane
    GridPane gridPanel = new GridPane();
    // Add the Labels and Fields to the GridPane
    gridPanel.addRow(0, firstNameLbl, firstNameFld);
    gridPanel.addRow(1, lastNameLbl, lastNameFld);
    
    // Set the Size of the GridPane
    gridPanel.setMinSize(350, 250);
    gridPanel.setStyle("-fx-padding: 10;"
            + "-fx-border-style: solid inside;"
            + "-fx-border-width: 2;"
            + "-fx-border-insets: 5;"
            + "-fx-border-radius: 5;"
            + "-fx-border-color: blue;");
    // Create the Scene
    Scene scene = new Scene(gridPanel);
    // Add the scene to the Stage
    stage.setScene(scene);
    // Set the title of the Stage
    stage.setTitle("A Label Example");
    // Display the Stage
    stage.show();
  }


  public static void main(String[] args)
  {
    Application.launch(args);
  }


}

