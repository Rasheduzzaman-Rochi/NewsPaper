package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Reporter2 {

    @javafx.fxml.FXML
    private ComboBox categoryComboBox;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private TextField subTitleTextField;
    @javafx.fxml.FXML
    private TableColumn categoryCol;
    @javafx.fxml.FXML
    private TableColumn subTitleCol;
    @javafx.fxml.FXML
    private TableColumn articleIDCol;
    @javafx.fxml.FXML
    private ComboBox filterCategoryComboBox;
    @javafx.fxml.FXML
    private TableView table;
    @javafx.fxml.FXML
    private TextField articleIDTextField;

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ReporterDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void showButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}
