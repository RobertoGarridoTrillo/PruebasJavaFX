package CookBook.fxml.E05;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Binding_Controller
{

   @FXML
   // The reference of inputText will be injected by the FXML loader
   private Label inputLbl;
   @FXML
   private TextField inputText;
   @FXML
   private Button okBtn;
   @FXML
   private Label outputLbl;
   @FXML
   private TextArea outputText;   
   
// location and resources will be automatically injected by the FXML loader
   @FXML
   private URL location;
   @FXML
   private ResourceBundle resources;
// Add a public no-args constructor

   public Binding_Controller()
   {
   }


   @FXML
   private void initialize()
   {
   }


   @FXML
   private void printOutput()
   {
      outputText.setText(inputText.getText());
   }


}

