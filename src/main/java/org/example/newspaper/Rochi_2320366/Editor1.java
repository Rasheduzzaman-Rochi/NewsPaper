package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.newspaper.Mandira_2321486.Reporter1ModelClass;

import java.io.*;
import java.time.LocalDate;

public class Editor1 {
    @FXML
    private Label massageLabel;
    @FXML
    private TableView<Reporter1ModelClass> table;
    @FXML
    private TextArea textArea;
    @FXML
    private TableColumn<Reporter1ModelClass, String> titleColumn;
    @FXML
    private TableColumn<Reporter1ModelClass, LocalDate> dateColumn;
    @FXML
    private TableColumn<Reporter1ModelClass, String> articleColumn;
    @FXML
    private TableColumn<Reporter1ModelClass, String> idColumn;

    private final String filePath = "Reporter1.txt";

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleColumn.setCellValueFactory(new PropertyValueFactory<>("article"));
    }

    @FXML
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

    @FXML
    public void onSave(ActionEvent actionEvent) {
        String updatedContent = textArea.getText().trim();

        if (updatedContent.isEmpty()) {
            massageLabel.setText("Text area is empty. Nothing to save!");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(updatedContent);
            writer.newLine();
            massageLabel.setText("Changes saved successfully!");
            textArea.clear();
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Error saving changes!");
        }
    }

    @FXML
    public void onConfirm(ActionEvent actionEvent) {

    }

    @FXML
    public void onEditArticle(ActionEvent actionEvent) {
        int selectedIndex = table.getSelectionModel().getSelectedIndex();
        if (selectedIndex == -1) {
            massageLabel.setText("Please select an article to edit!");
            return;
        }

        Reporter1ModelClass selectedArticle = table.getItems().get(selectedIndex);
        String id = selectedArticle.getId();
        String title = selectedArticle.getTitle();
        LocalDate date = selectedArticle.getDate();
        String article = selectedArticle.getArticle();

        String line = id + ", " + title + ", " + date + ", " + article;
        textArea.setText(line);
    }

    @FXML
    public void onLoad(ActionEvent actionEvent) {
        table.getItems().clear();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    Reporter1ModelClass user = new Reporter1ModelClass(data[0], data[1], LocalDate.parse(data[2]), data[3]);
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
