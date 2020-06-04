package Strings;

//<editor-fold defaultstate="collapsed" desc="import">
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
//</editor-fold>


/**
 *
 * @author Roberto Garrido Trillo
 */
public class CompareFile extends Application {

//<editor-fold defaultstate="collapsed" desc="fields class">
    File firstFile, secondFile;
    String firstPath = "", secondPath = "", firstName = "", secondName;
    String[] firstWords, secondWords;

    String thisLine;
    Stage stage;

    Button firstButton, secondButton;
    Label firstLabel, secondLabel;

    StringBuilder sb = new StringBuilder();
//</editor-fold>

    @Override
    public void start (Stage stage) {
        this.stage = stage;


        // Create the root
        VBox root = new VBox();

        firstButton = new Button("First File");
        firstLabel = new Label("");
        secondButton = new Button("Compare with dictionary");
        secondLabel = new Label("");


        firstButton.setOnMouseClicked(new FirstButton());
        secondButton.setOnMouseClicked(new SecondButton());

        root.setMinSize(350, 250);
        root.getChildren().addAll(firstButton, firstLabel, secondButton, secondLabel);

        // Create the scene
        Scene scene = new Scene(root);

        // Create the stage
        stage.setMinHeight(300);
        stage.setMinWidth(600);
        stage.setTitle("MP3 Player");
        stage.setScene(scene);
        stage.show();
    }


    /**
     * Returns a selectrd file
     *
     * @param stage
     *
     * @return the selected file
     */
    public File filechooser (Stage stage) {

        File file = null;
        try {
            FileChooser fc = new FileChooser();
            // Set extension filter
            FileChooser.ExtensionFilter filterTXT =
                    new FileChooser.ExtensionFilter(
                            "Text files (*.txt)", "*.txt");
            FileChooser.ExtensionFilter filterMP3 =
                    new FileChooser.ExtensionFilter(
                            "Music files (*.mp3)", "*.mp3");
            FileChooser.ExtensionFilter filterMP4 =
                    new FileChooser.ExtensionFilter(
                            "Video files (*.mp4, *.flv)", "*.mp4", "*.flv");
            FileChooser.ExtensionFilter filterAll =
                    new FileChooser.ExtensionFilter(
                            "All files (*.*)", "*.*");

            fc.getExtensionFilters().addAll(filterTXT, filterMP3, filterMP4, filterAll);

            /* fc.getExtensionFilters().addAll(
                    new ExtensionFilter("Music files (*.mp3)", "*.mp3"),
                    new ExtensionFilter("All Video files (*.mp4, *.flv)",
                             "*.mp4", "*.flv"),
                    new ExtensionFilter("All files", "*")); */
            file = fc.showOpenDialog(stage);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return file;
    }

    private class FirstButton implements EventHandler<MouseEvent> {

        @Override
        public void handle (MouseEvent t) {
            try {
                // Select the first file
                firstFile = filechooser(stage);
                // Read the path
                firstPath = firstFile.getAbsolutePath().toString();
                firstPath = firstPath.replace("\\", "/");
                int lastBar = firstPath.lastIndexOf("/");
                // Read the file name
                firstName = firstPath.substring(lastBar + 1, firstPath.length());
                // Put the file name in the label
                firstLabel.setText(firstName);

                // Open a bufferReader to the file
                BufferedReader br = new BufferedReader(new FileReader(firstPath));
                // Read the file
                firstWords = countWords(br);
                // 
                for (String firstWord : firstWords) {
                    System.out.println(firstWord);

}
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private class SecondButton implements EventHandler<MouseEvent> {

        @Override
        public void handle (MouseEvent t) {
            try (BufferedReader br = new BufferedReader(
                    new FileReader("../A/src/B/resources/dictionary/dictionary.txt"))) {
                
                if (firstPath.equals("")) {
                    message(Alert.AlertType.ERROR,
                            "Error message",
                            "Selecciona primer y segundo archivo archivo",
                            "Error en " +
                            "" +
                            "ThirdButton()");
                    return;
                }

                secondWords = countWords(br);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    /**
     * Read the words of a file
     */
    private String[] countWords (BufferedReader br) {

        String[] words = null;
        String newLine = String.valueOf(Character.toChars(10));

        try {

            // Extract the words in a StringBuilder
            while ((thisLine = br.readLine()) != null) {
                sb.append(thisLine).append("\n");
            }

            // Count the number of words
            int cont = 0;

            for (int i = 0; i < sb.length(); i++) {
                if (sb.codePointAt(i) == 10) {
                    cont++;
                }
            }

            // setting the Array of strings according to the new line
            words = new String[cont];

            // Separate the words 
            for (int i = 0; i < sb.length(); i++) {

                int newLineIndex = sb.indexOf(newLine);

                words[i] = sb.substring(i, newLineIndex);
                System.out.println(i + " " + words[i]);

                sb.delete(i, newLineIndex + 1);

                i--;
            }
        } catch (IOException e) {
        }
        return words;
    }

    /**
     * show a standard emergent message
     *
     * @param alertType alertType.CONFIRMATION, ERROR, INFORMATION, NONE, WARNING
     * @param title The title of the windows
     * @param about The them to expose
     * @param contextText The showed text
     */
    private void message (Alert.AlertType alertType, String title, String about, String contextText) {

        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(about);
        alert.setContentText(contextText);

        alert.showAndWait();
    }

    public static void main (String[] args) {

        Application.launch(args);

    }

}
