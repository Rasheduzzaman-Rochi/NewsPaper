package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.newspaper.Mandira_2321486.Reporter1ModelClass;
import org.example.newspaper.Mandira_2321486.Reporter2ModelClass;

import java.io.*;
import java.time.LocalDate;

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

    private final String reporterFilePath = "";

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
    public void onSave(ActionEvent actionEvent) {
        String updatedContent = textArea.getText().trim();

        if (updatedContent.isEmpty()) {
            massageLabel.setText("Text area is empty. Nothing to save!");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reporterFilePath, true))) {
            writer.write(updatedContent);
            writer.newLine();
            massageLabel.setText("Changes saved successfully!");
            textArea.clear();
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Error saving changes!");
        }
    }

    @javafx.fxml.FXML
    public void onLoad(ActionEvent actionEvent) {
        table.getItems().clear();

        try (BufferedReader br = new BufferedReader(new FileReader(reporterFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    Reporter2ModelClass user = new Reporter2ModelClass(data[0], data[1], data[2], data[3]);
                    table.getItems().add(user);
                }
            }
            massageLabel.setText("Data loaded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Error loading data!");
        }
    }
}