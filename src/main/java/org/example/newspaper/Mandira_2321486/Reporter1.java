package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Reporter1 {
    @javafx.fxml.FXML
    private TextArea commonThemesTextArea;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableView newsTable;
    @javafx.fxml.FXML
    private TableColumn sourceCol;
    @javafx.fxml.FXML
    private TableView linksTable;
    @javafx.fxml.FXML
    private TableColumn linkDateCol;
    @javafx.fxml.FXML
    private TextArea bestOneTextArea;
    @javafx.fxml.FXML
    private TableColumn linkCol;
    @javafx.fxml.FXML
    private TableColumn headlineCol;

    @javafx.fxml.FXML
    public void themesSaveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bestOneSaveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trendingNewsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void collectedLinksButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
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
    public void publishArticleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteLinkButton(ActionEvent actionEvent) {
    }
}
