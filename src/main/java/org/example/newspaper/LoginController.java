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
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}