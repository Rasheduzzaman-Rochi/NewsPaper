package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutDesigner2 {

    @FXML
    private Label headlineText;

    @FXML
    private Label layoutDesigner;

    @FXML
    private TextArea textArea;

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
    void OnFontStyle1ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle2ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle3ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle4ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle5ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle6ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle7ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnFontStyle8ButtonClick(ActionEvent event) {

    }

    @FXML
    void OnSaveTheHeadlineButtonClick(ActionEvent event) {

    }

    @FXML
    void OnSelectTheFontButtonClick(ActionEvent event) {

    }

}
