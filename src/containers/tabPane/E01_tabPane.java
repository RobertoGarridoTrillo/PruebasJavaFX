package containers.tabPane;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        // Add listener to tab
        tabPane.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener<Tab>() {
                    @Override
                    public void changed (ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
                        System.out.println("Tab Selection changed " + t1.getText());
                    }
                }
                );

        // Create Container and items Write
        HBox hboxWrite = new HBox();
        TextArea textAreaWrite = new TextArea();
        textAreaWrite.setPrefWidth(200);
        textAreaWrite.setPrefHeight(10);
        TextField textFieldWrite = new TextField("Write");
        hboxWrite.getChildren().addAll(textAreaWrite, textFieldWrite);

        // Create Container and items Read
        HBox hboxRead = new HBox();
        TextArea textAreaRead = new TextArea();
        textAreaRead.setPrefWidth(200);
        textAreaRead.setPrefHeight(10);

        TextField textFieldRead = new TextField("Read");
        hboxRead.getChildren().addAll(textAreaRead, textFieldRead);

        // bidirectional binding
        textFieldWrite.textProperty().bind(textFieldRead.textProperty());
        textAreaRead.textProperty().bindBidirectional(textAreaWrite.textProperty());

        tabWrite.setContent(hboxWrite);
        tabRead.setContent(hboxRead);

        tabPane.getTabs().addAll(tabWrite, tabRead);
        //tabPane.getTabs().add(tabWrite);
        //tabPane.getTabs().add(tabRead);

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
