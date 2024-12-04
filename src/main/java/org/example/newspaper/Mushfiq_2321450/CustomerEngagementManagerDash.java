package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerEngagementManagerDash {

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    void OnAnalyticsButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager8.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnContentManagementButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager5.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnCreateSurveyButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager1.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnDesignSubscriptionModelButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager3.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnFeedbackManagementButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager7.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    void OnGatherFeedbackButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager2.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnLogoutButtonClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnPromoteSubscriptionButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager4.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OnTrainingManagementButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManager6.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
