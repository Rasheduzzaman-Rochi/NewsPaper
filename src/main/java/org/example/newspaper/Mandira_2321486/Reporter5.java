package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Reporter5 {
    @javafx.fxml.FXML
    private ListView notesList;
    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private TableView articleTable;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TextField additionalInputBox;
    @javafx.fxml.FXML
    private ComboBox verficationStatusComboBox;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TextArea articleTextArea;

    @javafx.fxml.FXML
    public void verificationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveStatusButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectArticleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addNotesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendNotificationButton(ActionEvent actionEvent) {
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
}
