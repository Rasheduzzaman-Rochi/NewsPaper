package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;

public class CustomerEngagementManager6 {
    @javafx.fxml.FXML
    private TableColumn idCol;
    @javafx.fxml.FXML
    private TextField contentTF;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Label label1;
    @javafx.fxml.FXML
    private ComboBox comboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private Label label2;
    @javafx.fxml.FXML
    private TableColumn groupCol;

    @javafx.fxml.FXML
    public void OnAssignButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OnUploadVideoButtonClick(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void OnAttachFilesButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OnAddButtonClick(ActionEvent actionEvent) {
    }
}
