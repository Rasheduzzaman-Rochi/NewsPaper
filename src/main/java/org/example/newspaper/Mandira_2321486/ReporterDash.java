package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReporterDash {
    @javafx.fxml.FXML
    public void regularMeetingsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewArticlesButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Reporte2.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void informationVariousSourceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) {
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
    public void trendingNewsButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Reporter1.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void qualityAndClarityButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eventSchedulesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void journalisticIntigrityButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void imagesAndVisuakMaterialsButton(ActionEvent actionEvent) {
    }
}
