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

public class loginController {

    @FXML
    private TextField passwordBox;
    @FXML
    private TextField usernameBox;
    @FXML
    private Label massageLabel;

    @FXML
    public void onLogin(ActionEvent actionEvent) {
        String username = usernameBox.getText();
        String password = passwordBox.getText();

        if ("Advertising Manager".equals(username) && "arong".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("AdvertisingManagerDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }

        if ("Data Entry".equals(username) && "mandira".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("DataEntryDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }

        if ("Reporter".equals(username) && "mandira".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ReporterDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }

        if ("Customer Engagement Manager".equals(username) && "mushfiq".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerEngagementManagerDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }

        if ("Layout Designer".equals(username) && "mushfiq".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LayoutDesignerDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }

        if ("Content Manager".equals(username) && "rochi".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ContentManagerDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }

        if ("Editor".equals(username) && "rochi".equals(password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("EditorDash.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameBox.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                massageLabel.setText("Error loading the dashboard. Please try again.");
            }
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}