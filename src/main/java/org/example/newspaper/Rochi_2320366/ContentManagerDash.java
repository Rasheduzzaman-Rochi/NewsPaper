package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentManagerDash {
    @javafx.fxml.FXML
    public void onTrack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ContentManager1.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onEdit(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ContentManager2.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onOrganize(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onReview(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onCreation(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onLogout(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onAnalyze(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onCollaborate(ActionEvent actionEvent) {
    }
}
