package Strings;

//<editor-fold defaultstate="collapsed" desc="import">
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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


/**
 *
 * @author Roberto Garrido Trillo
 */
public class CompareFile extends Application {

//<editor-fold defaultstate="collapsed" desc="fields class">
    File firstFile, secondFile;
    String firstPath = "", secondPath = "", firstName = "", secondName;
    String[] firstWords, secondWords, thirdWords;
    List<String> as;

    String thisLine;
    Stage stage;

    Button firstButton, secondButton, thirdButton;
    Label firstLabel, secondLabel, thirdLabel;

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
        thirdButton = new Button("Update dictionary");
        thirdLabel = new Label("");

        firstButton.setOnMouseClicked(new FirstButton());
        secondButton.setOnMouseClicked(new SecondButton());
        thirdButton.setOnMouseClicked(new ThirdButton());

        root.setMinSize(350, 250);
        root.getChildren().addAll(firstButton, firstLabel, secondButton,
                secondLabel, thirdButton, thirdLabel);

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


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private class SecondButton implements EventHandler<MouseEvent> {

        @Override
        public void handle (MouseEvent t) {

            // opwn a bufferedReader to the dictionay
            try {
                // open the dictionary
                BufferedReader br = readDictionary();
                // Read the dictinoary
                secondWords = countWords(br);
                // Compare the dictionary with the file
                compareDictionary();

            } catch (Exception e) {
                message(Alert.AlertType.ERROR, "Error", "SecondButton", e.getMessage());
                e.printStackTrace();
            }

        }
    }

    private class ThirdButton implements EventHandler<MouseEvent> {

        @Override
        public void handle (MouseEvent t) {
            
            if (secondWords==null) return;
            
            // Join the dictionary and the new words
            for (int i = 0; i < secondWords.length; i++) {
                as.add(secondWords[i]);
            }
            // Sorting the Arraylist
            Collections.sort(as);
            try {
                //
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("../A/src/B/resources/dictionary/dictionary.txt"));
                
                for (int i = 0; i < as.size(); i++) {
                    bw.write(as.get(i) + "\n");
                    bw.flush();
                }
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }


        }
    }

    /**
     * Read the content of the dictionary
     *
     * @return @throws IOException
     */
    private BufferedReader readDictionary () throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("../A/src/B/resources/dictionary/dictionary.txt"));
        // I need the first file open
        if (firstPath.equals("")) {
            message(Alert.AlertType.ERROR, "Error message",
                    "Selecciona primer archivo", "Error en ThirdButton()");
        }
        return br;
    }

    /**
     * Compare the dictionary with the file. Create a new file with the new words
     */
    private void compareDictionary () {

        // fields
        as = new ArrayList<String>();
        int j;
        boolean b = false;
        int lengthFirstWords = firstWords.length;
        int lengthSecondWords = secondWords.length;


        try {
            // Doing two loops witd Strings[] and compare one with the other
            for (int i = 0; i < lengthFirstWords; i++) {

                b = false;

                for (j = 0; j < lengthSecondWords; j++) {

                    if (firstWords[i].equals(secondWords[j])) {
                        b = true;
                        break;
                    }
                }

                j--;
                if (!b && i < lengthFirstWords) {
                    as.add(firstWords[i]);
                }
            }


            // Cast to String[] / pass data from ArraList to String[]
            thirdWords = new String[as.size()];
            thirdWords = as.toArray(thirdWords);

            // Print in the screen the numbers of new labels
            secondLabel.setText("New words: " + thirdWords.length);

            // if there are some new words save a new file with the new words
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(firstFile.getParent() + "/newWords.txt"));
            for (String thirdWord : thirdWords) {
                bw.write(thirdWord + "\n");
                bw.flush();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
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

            int i = 0;
            // Separate the words 
            while (sb.length() > 0) {
                // Looking for the new line character
                int newLineIndex = sb.indexOf(newLine);
                // Extracting the word
                words[i] = sb.substring(0, newLineIndex);

                // Deleting the word and starting againg
                sb = sb.delete(0, newLineIndex + 1);
                i++;
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
    private void message (Alert.AlertType alertType, String title,
            String about, String contextText) {

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
