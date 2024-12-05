package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Editor3 {
    @javafx.fxml.FXML
    private TableColumn titleColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TableView table;
    @javafx.fxml.FXML
    private ComboBox StatusComboBox;
    @javafx.fxml.FXML
    private TableColumn idColumn;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private TextField factualBox;

    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onVerify(ActionEvent actionEvent) {
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
}
