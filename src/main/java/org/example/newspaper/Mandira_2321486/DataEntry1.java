package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class DataEntry1 {
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn idCol;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private DatePicker submissionDatePicker;
    @javafx.fxml.FXML
    private TableView table;

    @javafx.fxml.FXML
    private void initialize(){

    }

    @javafx.fxml.FXML
    public void saveArticleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DataEntryDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }

    
}
