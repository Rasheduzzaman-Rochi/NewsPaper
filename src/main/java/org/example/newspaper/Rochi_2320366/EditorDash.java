package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.newspaper.LoginApplication;

import java.io.IOException;

public class EditorDash {
    @javafx.fxml.FXML
    public void onTrack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor8.fxml"));
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
            Parent root = FXMLLoader.load(getClass().getResource("Editor1.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onEditHeadlines(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor2.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onFactualAccuracy(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onManageDeadlines(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onProofread(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onCollaborate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onCoordinate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onLogout(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
