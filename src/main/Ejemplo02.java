package main;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo02 extends Application
{

   @Override
   public void start(Stage stage) throws Exception
   {
      
      URL fxmlURL = getClass().getResource("Vista.fxml");
      Parent root = FXMLLoader.load(fxmlURL);
      stage.setTitle("Ejemplo 02");
      stage.setScene(new Scene(root));
      stage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
