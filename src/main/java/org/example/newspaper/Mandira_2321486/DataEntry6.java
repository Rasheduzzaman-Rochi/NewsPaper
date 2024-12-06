package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class DataEntry6 {
    @javafx.fxml.FXML
    private ComboBox categoriesComboBox;
    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn authorCol;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn categoryCol;
    @javafx.fxml.FXML
    private TableView table;

    @javafx.fxml.FXML
    public void saveReportButton(ActionEvent actionEvent) {
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
    public void generateReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifyTeamMemberButton(ActionEvent actionEvent) {
    }
}
