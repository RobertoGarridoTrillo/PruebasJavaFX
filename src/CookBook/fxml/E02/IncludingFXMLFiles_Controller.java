package CookBook.fxml.E02;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class IncludingFXMLFiles_Controller
{

   @FXML
// The reference of inputText will be injected by the FXML loader
   private TextField inputText;
// The reference of outputText will be injected by the FXML loader
   @FXML
   private TextArea outputText;
// location and resources will be automatically injected by the FXML loader
   @FXML
   private URL location;
   @FXML
   private ResourceBundle resources;
// Add a public no-args constructor

   public IncludingFXMLFiles_Controller()
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

