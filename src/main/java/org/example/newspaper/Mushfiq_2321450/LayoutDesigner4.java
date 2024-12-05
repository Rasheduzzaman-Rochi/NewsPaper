package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutDesigner4 {

    @FXML
    private TextField HeightTF;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private TextField widthTF;

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
    void OnSaveButtonClick(ActionEvent event) {

    }

    @FXML
    void OnTemplate1ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnTemplate2ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnTemplate3ButtonClick(ActionEvent event) {

    }

}
