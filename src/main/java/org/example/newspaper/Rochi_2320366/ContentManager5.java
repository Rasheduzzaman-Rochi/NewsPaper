package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ContentManager5 {
    @javafx.fxml.FXML
    private ComboBox categoryComboBox;
    @javafx.fxml.FXML
    private BarChart barChart;
    @javafx.fxml.FXML
    private LineChart lineChart;
    @javafx.fxml.FXML
    private DatePicker dateBox;
    @javafx.fxml.FXML
    private TextField searchBox;

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
    public void onApplyFilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSaveReport(ActionEvent actionEvent) {
    }
}
