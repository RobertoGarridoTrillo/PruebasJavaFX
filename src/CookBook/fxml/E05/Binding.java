package CookBook.fxml.E05;

/**
 *
 * @author Roberto Garrido Trillo
 */
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Binding extends Application
{

   public static void main(String[] args)
   {
      Application.launch(args);
   }


   @Override
   public void start(Stage stage)
           throws IOException
   {
// Create the FXMLLoader
      FXMLLoader loader = new FXMLLoader();
// Path to the FXML File 
      String fxmlDocPath = "src/CookBook/fxml/E05/Binding.fxml";
      FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
// Create the Pane and all Details
      VBox root = (VBox) loader.load(fxmlStream);
// Create the Scene
      Scene scene = new Scene(root);
// Set the Scene to the Stage
      stage.setScene(scene);
// Set the Title to the Stage
      stage.setTitle("A FXML Example with Binding Properties");
// Display the Stage
      stage.show();
   }


   private void printOutput()
   {
      System.out.println("asdfasdf");
   }


}

