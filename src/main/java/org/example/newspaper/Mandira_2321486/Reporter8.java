package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporter8 {
    @javafx.fxml.FXML
    private TableColumn<Reporter8ModelClass,String> locationCol;
    @javafx.fxml.FXML
    private DatePicker eventDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Reporter8ModelClass, LocalDate> dateCol;
    @javafx.fxml.FXML
    private ComboBox<String> reporterComboBox;
    @javafx.fxml.FXML
    private TableColumn<Reporter8ModelClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter8ModelClass,String> timeCol;
    @javafx.fxml.FXML
    private ComboBox<String> filterLocationComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> locationCombo;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableView<Reporter8ModelClass> table;
    @javafx.fxml.FXML
    private TableColumn<Reporter8ModelClass,String> reportersCol;

    private ArrayList<Reporter8ModelClass> userList = new ArrayList<>();
    private ArrayList<Reporter8ModelClass> filterlocation = new ArrayList<>();
    @javafx.fxml.FXML
    private TextArea showTextArea;

    @javafx.fxml.FXML
    private void initialize(){
        locationCombo.getItems().addAll("Dhaka","Sylhet","Chittagong","Barisal","Cumilla");
        reporterComboBox.getItems().addAll("Rahim","Karim","Sakib","rashid");
        filterLocationComboBox.getItems().addAll("Dhaka","Sylhet","Chittagong","Barisal","Cumilla");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        reportersCol.setCellValueFactory(new PropertyValueFactory<>("reporters"));
    }

    @javafx.fxml.FXML
    public void saveEventButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        LocalDate date = eventDatePicker.getValue();
        String time = timeTextField.getText();
        String location = locationCombo.getValue();
        String reporter = reporterComboBox.getValue();

        Reporter8ModelClass u = new Reporter8ModelClass(name,date,time,location,reporter);
        table.getItems().addAll(u);
        userList.add(u);
    }

    @javafx.fxml.FXML
    public void editEventButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        LocalDate date = eventDatePicker.getValue();
        String time = timeTextField.getText();
        String location =  locationCombo.getValue();
        String reporter = reporterComboBox.getValue();
        String line = name + " , " + date + " , " + time + " , " + location + " , " + reporter;
        showTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ReporterDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterByLocation(ActionEvent actionEvent) {
        String filterByCategory = filterLocationComboBox.getValue();
        filterlocation.clear();
        for (Reporter8ModelClass c :userList ) {
            if (c.getLocation().equals(filterByCategory)) {
                filterlocation.add(c);

            }
        }
        System.out.println(table.toString());
        System.out.println(filterlocation.toString());

        table.getItems().clear();
        table.getItems().addAll(filterlocation);
    }
}
