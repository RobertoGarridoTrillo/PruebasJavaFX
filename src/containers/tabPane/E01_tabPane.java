package containers.tabPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class E01_tabPane extends Application{

    @Override
    public void start (Stage stage) throws Exception {
        
        // Crete tabPane
        TabPane tabPane = new TabPane();
        // Create tab
        Tab tabWrite = new Tab("Write");
        Tab tabRead = new Tab("Read");
        
        TextArea textArea = new TextArea();
        
        Label label = new Label(); 
        label.textProperty().bind(textArea.textProperty());
        
        tabPane.getTabs().add(tabWrite);
        tabPane.getTabs().add(tabRead);
        
        tabRead.setContent(label);
        tabWrite.setContent(textArea);
        
        Scene scene = new Scene(tabPane);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
         Application.launch(args);
}

}
