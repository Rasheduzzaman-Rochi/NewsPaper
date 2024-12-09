package org.example.newspaper.Rochi_2320366;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.newspaper.Mandira_2321486.Reporter2ModelClass;

import java.io.*;

public class Editor2 {
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableView<Reporter2ModelClass> table;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> subtitleColumn;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> titleColumn;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> categoryColumn;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> idColumn;

    private final String reporterFilePath = "Reporter2.bin";

    @javafx.fxml.FXML
    public void initialize(){
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        subtitleColumn.setCellValueFactory(new PropertyValueFactory<>("subtitle"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
    }

    @javafx.fxml.FXML
    public void onEdit(ActionEvent actionEvent) {
        int selectedIndex = table.getSelectionModel().getSelectedIndex();
        if (selectedIndex == -1) {
            massageLabel.setText("Please select an article to edit!");
            return;
        }

        Reporter2ModelClass selectedArticle = table.getItems().get(selectedIndex);
        String id = selectedArticle.getId();
        String title = selectedArticle.getTitle();
        String subtitle = selectedArticle.getTitle();
        String category = selectedArticle.getCategory();

        String line = id + ", " + title + ", " + subtitle + ", " + category;
        textArea.setText(line);
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditorDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) throws IOException{
        ObservableList<Reporter2ModelClass> currentItems = table.getItems();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Reporter2.bin"))) {
            for (Reporter2ModelClass item : currentItems) {
                oos.writeObject(item);
            }
            massageLabel.setText("Data saved successfully with updates.");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Could not save Data.");
        }
    }

    @javafx.fxml.FXML
    public void onLoad(ActionEvent actionEvent) throws IOException{
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(reporterFilePath));

            while (true) {
                Reporter2ModelClass u = (Reporter2ModelClass) ois.readObject();
                table.getItems().add(u);
                if (ois.available() == 0) {
                    break;
                }
            }
        } catch (EOFException e) {
            massageLabel.setText("Successfully loaded objects from file!");
        } catch (ClassNotFoundException e) {
            massageLabel.setText("Bad file format!");
        } catch (IOException e) {
            massageLabel.setText("Could not load from object file!");
        } finally {
            if (ois != null)
                ois.close();
        }
    }
}