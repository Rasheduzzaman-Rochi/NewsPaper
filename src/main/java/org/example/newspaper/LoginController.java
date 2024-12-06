package org.example.newspaper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField passwordBox;
    @FXML
    private TextField usernameBox;
    @FXML
    private Label massageLabel;

    @FXML
    public void onLogin(ActionEvent actionEvent) throws IOException {
        String username = usernameBox.getText();
        String password = passwordBox.getText();

        if ("Editor".equals(username) && "rochi".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Rochi_2320366/EditorDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("Content Manager".equals(username) && "rochi".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Rochi_2320366/ContentManagerDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("Data Entry".equals(username) && "mandira".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mandira_2321486/DataEntryDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("Reporter".equals(username) && "mandira".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mandira_2321486/ReporterDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("Customer Engagement Manager".equals(username) && "mushfiq".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mushfiq_2321450/CustomerEngagementManagerDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("Layout Designer".equals(username) && "mushfiq".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mushfiq_2321450/LayoutDesignerDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}