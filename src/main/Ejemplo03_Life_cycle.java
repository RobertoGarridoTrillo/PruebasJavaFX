package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo03_Life_cycle extends Application
{

  @Override
  public void init() throws Exception
  {
    super.init();
    System.out.println("Estoy en la fase \"inicio\"");
  }


  @Override
  public void start(Stage primaryStage) throws Exception
  {

    System.out.println("Estoy en la fase \"start\"");

    //creating a Group object (node Root)
    Group group = new Group();

    //Creating a Scene by passing the group object, height and width   
    Scene scene = new Scene(group, 600, 300);

    //setting color to the scene 
    scene.setFill(Color.BROWN);

    //Setting the title to Stage. 
    primaryStage.setTitle("Life cycle");

    //Adding the scene to Stage 
    primaryStage.setScene(scene);

    //Displaying the contents of the stage 
    primaryStage.show();

  }


  @Override
  public void stop() throws Exception
  {
    super.stop();
    System.out.println("Estoy en la fase \"stop\"");
  }


  public static void main(String args[])
  {
    launch(args);
  }


}

