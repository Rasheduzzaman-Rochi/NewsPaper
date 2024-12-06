package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentManager8 {
    @javafx.fxml.FXML
    private TableColumn viewColumn;
    @javafx.fxml.FXML
    private TableColumn performanceColumn;
    @javafx.fxml.FXML
    private BarChart barChart;
    @javafx.fxml.FXML
    private TableColumn titleColumn;
    @javafx.fxml.FXML
    private DatePicker endDateBox;
    @javafx.fxml.FXML
    private TableColumn commentsColumn;
    @javafx.fxml.FXML
    private DatePicker startDateBox;
    @javafx.fxml.FXML
    private TableColumn likeColumn;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableView table;
    @javafx.fxml.FXML
    private TextField inputBox;

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ContentManagerDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onFinalize(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onAnalyze(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
    }
}
