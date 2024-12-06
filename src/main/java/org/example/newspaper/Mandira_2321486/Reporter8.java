package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class Reporter8 {
    @javafx.fxml.FXML
    private TableColumn locationCol;
    @javafx.fxml.FXML
    private TableColumn filterDateCol;
    @javafx.fxml.FXML
    private TableView filterTable;
    @javafx.fxml.FXML
    private TableColumn filterLocationCol;
    @javafx.fxml.FXML
    private DatePicker eventDatePicker;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private ComboBox reporterComboBox;
    @javafx.fxml.FXML
    private ComboBox filterDateComboBox;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableView eventTable;
    @javafx.fxml.FXML
    private TableColumn timeCol;
    @javafx.fxml.FXML
    private TableColumn eventNameCol;
    @javafx.fxml.FXML
    private ComboBox filterLocationComboBox;

    @javafx.fxml.FXML
    public void saveEventButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteEventButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newEventButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editEventButton(ActionEvent actionEvent) {
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
