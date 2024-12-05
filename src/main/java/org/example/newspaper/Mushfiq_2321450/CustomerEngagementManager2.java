package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerEngagementManager2 {

    @FXML
    private ComboBox<?> comboBox;

    @FXML
    private DatePicker distributionTime;

    @FXML
    private TextField firstQuestionTF;

    @FXML
    private TextField fourthQuestionTF;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private ToggleGroup option1;

    @FXML
    private ToggleGroup option2;

    @FXML
    private ToggleGroup option3;

    @FXML
    private ToggleGroup option4;

    @FXML
    private TextField secondQuestionTF;

    @FXML
    private TextField thirdQuestionTF;

    @FXML
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

    @FXML
    void OnSubmitButtonClick(ActionEvent event) {

    }

}
