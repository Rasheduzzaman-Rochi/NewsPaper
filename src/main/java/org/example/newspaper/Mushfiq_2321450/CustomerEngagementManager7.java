package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerEngagementManager7 {
    @javafx.fxml.FXML
    private TableColumn issueCol;
    @javafx.fxml.FXML
    private TableColumn idCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void OnAssignButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OnBackButtonClick(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManagerDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






