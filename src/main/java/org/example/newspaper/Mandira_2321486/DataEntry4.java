package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class DataEntry4 {
    @javafx.fxml.FXML
    private ImageView image;
    @javafx.fxml.FXML
    private ComboBox selectArticleComboBox;
    @javafx.fxml.FXML
    private ListView imageLIst;

    @javafx.fxml.FXML
    public void uploadImageButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveImageButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DataEntryDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void notifyEditorialTeamButton(ActionEvent actionEvent) {
    }
}
