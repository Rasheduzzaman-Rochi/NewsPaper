package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutDesigner6 {

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    public void OnBackButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LayoutDesignerDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnInsertButtonClick(ActionEvent event) {

    }

    @FXML
    void OnSaveAndSubmitClick(ActionEvent event) {

    }

    @FXML
    void OnSelect1ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnSelect2ButtonClick(ActionEvent event) {

    }

}

