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
public class Ejemplo01_EmptyWindow extends Application
{

  /**
   * <P>
   * There are five types of stages available Decorated Undecorated Transparent
   * Unified Utility
   * </P>
   * <P>
   * Scene
   *
   * A scene represents the physical contents of a JavaFX application. It
   * contains all the contents of a scene graph. The class Scene of the package
   * javafx.scene represents the scene object. At an instance, the scene object
   * is added to only one stage.
   *
   * You can create a scene by instantiating the Scene Class. You can opt for
   * the size of the scene by passing its dimensions (height and width) along
   * with the root node to its constructor.
   * </P>
   * <P>
   * Scene Graph and Nodes
   *
   * A scene graph is a tree-like data structure (hierarchical) representing the
   * contents of a scene. In contrast, a node is a visual/graphical object of a
   * scene graph.
   *
   * A node may include:
   *
   * Geometrical (Graphical) objects (2D and 3D) such as − Circle, Rectangle,
   * Polygon, etc.
   *
   * UI Controls such as − Button, Checkbox, Choice Box, Text Area, etc.
   *
   * Containers (Layout Panes) such as Border Pane, Grid Pane, Flow Pane, etc.
   *
   * Media elements such as Audio, Video and Image Objects.
   * </P>
   * <P>
   * The Node Class of the package javafx.scene represents a node in JavaFX,
   * this class is the super class of all the nodes.
   *
   * There are nodes of three types:
   *
   * Root Node − The first Scene Graph is known as the Root node.
   *
   * Branch Node/Parent Node − The node with child nodes are known as
   * branch/parent nodes. The abstract class named Parent of the package
   * javafx.scene is the base class of all the parent nodes, and those parent
   * nodes will be of the following types:
   *
   * Group − A group node is a collective node that contains a list of children
   * nodes. Whenever the group node is rendered, all its child nodes are
   * rendered in order. Any transformation, effect state applied on the group
   * will be applied to all the child nodes.
   *
   * Region − It is the base class of all the JavaFX Node based UI Controls,
   * such as Chart, Pane and Control.
   *
   * WebView − This node manages the web engine and displays its contents.
   *
   * Leaf Node − The node without child nodes is known as the leaf node. For
   * example, Rectangle, Ellipse, Box, ImageView, MediaView are examples of leaf
   * nodes.
   * </p>
   *
   * Since the root node is the first node, you need to create a root node. As a
   * root node, you can choose from the Group, Region or WebView.
   *
   * @param primaryStage
   * @throws Exception
   */
  @Override
  public void start(Stage primaryStage) throws Exception
  {
    //creating a Group object (node Root)
    Group group = new Group();

    //Creating a Scene by passing the group object, height and width   
    Scene scene = new Scene(group, 600, 300);

    //setting color to the scene 
    scene.setFill(Color.BROWN);

    //Setting the title to Stage. 
    primaryStage.setTitle("Empty window");

    //Adding the scene to Stage 
    primaryStage.setScene(scene);

    //Displaying the contents of the stage 
    primaryStage.show();
  }


  public static void main(String args[])
  {
    launch(args);
  }


}

