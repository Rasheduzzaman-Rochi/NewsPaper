package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LayoutDesigner8 {

    @FXML
    private ComboBox<?> comboBox;

    @FXML
    private Pane pane;

    @FXML
    void OnApplyButtonClick(ActionEvent event) {

    }

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
    void OnOpenLayoutButtonClick(ActionEvent event) {

    }

    @FXML
    void OnSaveButtonClick(ActionEvent event) {

    }

}
