package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class DataEntry7 {
    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private TableView Table;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TextArea reporterTextArea;
    @javafx.fxml.FXML
    private ToggleGroup communication;
    @javafx.fxml.FXML
    private TableColumn assignedReporterCol;

    @javafx.fxml.FXML
    public void saveUpdatesButton(ActionEvent actionEvent) {
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
    public void contactReporterButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendMassageButton(ActionEvent actionEvent) {
    }
}
