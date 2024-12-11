package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Editor6 {
    @javafx.fxml.FXML
    private ImageView layout;
    @javafx.fxml.FXML
    private ComboBox<String> StatusBox;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private Label masssageLabel;
    private final String dataFilePath = "Editor6.bin";

    @javafx.fxml.FXML
    public void initialize() {
        StatusBox.getItems().addAll("Pending", "Approved", "Rejected");

        try {
            File file = new File(dataFilePath);
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                StringBuilder data = new StringBuilder();
                while (scanner.hasNextLine()) {
                    data.append(scanner.nextLine()).append("\n");
                }
                textArea.setText(data.toString());
                scanner.close();
            }
        } catch (IOException e) {
            masssageLabel.setText("Error loading data.");
        }
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditorDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onZoomIn(ActionEvent actionEvent) {
        layout.setFitWidth(layout.getFitWidth() + 20);
        layout.setFitHeight(layout.getFitHeight() + 20);
    }

    @javafx.fxml.FXML
    public void onZoomOut(ActionEvent actionEvent) {
        layout.setFitWidth(layout.getFitWidth() - 20);
        layout.setFitHeight(layout.getFitHeight() - 20);
    }

    @javafx.fxml.FXML
    public void onConfirm(ActionEvent actionEvent) {
        masssageLabel.setText("Approval confirmed.");
    }

    @javafx.fxml.FXML
    public void onApply(ActionEvent actionEvent) {
        String selectedStatus = StatusBox.getValue();
        if (selectedStatus == null || selectedStatus.isEmpty()) {
            masssageLabel.setText("Please select a status.");
            return;
        }

        String updatedData = textArea.getText() + "\nStatus: " + selectedStatus;
        textArea.setText(updatedData);

        try {
            FileWriter writer = new FileWriter(dataFilePath, false);
            writer.write(updatedData);
            writer.close();
            masssageLabel.setText("Data saved successfully.");
        } catch (IOException e) {
            masssageLabel.setText("Error saving data.");
        }
    }
}