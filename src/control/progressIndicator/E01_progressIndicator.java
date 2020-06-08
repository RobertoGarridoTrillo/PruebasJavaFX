package control.progressIndicator;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E01_progressIndicator extends Application {

    Task copyWorker;

    @Override
    public void start (Stage primaryStage) {
        primaryStage.setTitle("Background Processes");
        Group root = new Group();
        Scene scene = new Scene(root, 330, 120, Color.WHITE);

        BorderPane mainPane = new BorderPane();
        root.getChildren().add(mainPane);

        Label label = new Label("Files Transfer:");
        final ProgressIndicator progressIndicator = new ProgressIndicator(0);

        final HBox hb = new HBox();
        hb.setSpacing(5);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(label, progressIndicator);
        mainPane.setTop(hb);

        final Button startButton = new Button("Start");
        final Button cancelButton = new Button("Cancel");
        final HBox hb2 = new HBox();
        hb2.setSpacing(5);
        hb2.setAlignment(Pos.CENTER);
        hb2.getChildren().addAll(startButton, cancelButton);
        mainPane.setBottom(hb2);

        startButton.setOnAction(event -> {
            startButton.setDisable(true);
            progressIndicator.setProgress(0);
            cancelButton.setDisable(false);
            copyWorker = createWorker();

            progressIndicator.progressProperty().unbind();
            progressIndicator.progressProperty().bind(copyWorker.progressProperty());

            new Thread(copyWorker).start();
        });

        cancelButton.setOnAction(event -> {
            startButton.setDisable(false);
            cancelButton.setDisable(true);
            copyWorker.cancel(true);
            progressIndicator.progressProperty().unbind();
            progressIndicator.setProgress(0);
        });

        primaryStage.setScene(scene);
        primaryStage.show();

        progressIndicator.progressProperty().addListener((observable, oldValue, newValue) -> {

            // If progress is 100% then show Text
            if (newValue.doubleValue() >= 1) {
                // Apply CSS so you can lookup the text
                progressIndicator.applyCss();
                Text text = (Text) progressIndicator.lookup(".text.percentage");
                // This text replaces "Done"
                text.setText("Foo");
            }
        });
    }




    public Task createWorker() {
        return new Task() {
            @Override
        protected Object call() throws Exception {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(500);
                    updateMessage("2000 milliseconds");
                    updateProgress(i + 1, 10);
                }
                return true;
            }
        };
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
