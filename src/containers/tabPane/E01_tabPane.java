package containers.tabPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E01_tabPane extends Application {

    @Override
    public void start (Stage stage) throws Exception {

        // Crete tabPane
        TabPane tabPane = new TabPane();
        // Create tab
        Tab tabWrite = new Tab("Write");
        Tab tabRead = new Tab("Read");

        // Create Container and items Write
        HBox hboxWrite = new HBox();
        TextArea textAreaWrite = new TextArea();
        textAreaWrite.setPrefWidth(200);
        textAreaWrite.setPrefHeight(10);
        TextField textWrite = new TextField("Write");
        hboxWrite.getChildren().addAll(textAreaWrite, textWrite);

        // Create Container and items Read
        HBox hboxRead = new HBox();
        TextArea textAreaRead = new TextArea();
        textAreaRead.setPrefWidth(200);
        textAreaRead.setPrefHeight(10);
        
        TextField textRead = new TextField("Read");
        hboxRead.getChildren().addAll(textAreaRead, textRead);

        // bidirectional binding
        textWrite.textProperty().bind(textRead.textProperty());
        textAreaRead.textProperty().bindBidirectional(textAreaWrite.textProperty());
        
        tabWrite.setContent(hboxWrite);
        tabRead.setContent(hboxRead);
        //tabRead.setContent(labelRead);

        tabPane.getTabs().addAll(tabWrite, tabRead);
        //tabPane.getTabs().add(tabWrite);
        //bbtabPane.getTabs().add(tabRead);

        Scene scene = new Scene(tabPane);
        stage.setScene(scene);
        stage.setWidth(600);
        stage.setHeight(400);
        stage.show();

    }

    public static void main (String[] args) {
        Application.launch(args);
    }

}
