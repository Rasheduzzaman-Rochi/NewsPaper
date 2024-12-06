package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class DataEntry5 {
    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private ComboBox categoryComboBox;
    @javafx.fxml.FXML
    private TableView articleTable;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private ComboBox titleComboBox;
    @javafx.fxml.FXML
    private TableColumn categoryCol;

    @javafx.fxml.FXML
    public void categoryFilterButton(ActionEvent actionEvent) {
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
