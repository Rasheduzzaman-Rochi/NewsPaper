package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutDesigner1 {

    @FXML
    private Canvas canvas;

    @FXML
    private ComboBox<?> comboBoxFontColour;

    @FXML
    private ComboBox<?> comboBoxFontSize;

    @FXML
    private ComboBox<?> comboBoxShapes;

    @FXML
    private Label labelText;

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
    void OnPrintButtonClick(ActionEvent event) {

    }

    @FXML
    void OnSaveChangesButtonClick(ActionEvent event) {

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
