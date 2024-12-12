package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class CustomerEngagementManager5 {
    @javafx.fxml.FXML
    private TextField headingTF;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;
    @FXML
    private TableColumn<CustomerEngagementManager5ModelClass, String> audienceCol;
    @FXML
    private TableView<CustomerEngagementManager5ModelClass> tableView;
    @FXML
    private TableColumn<CustomerEngagementManager5ModelClass, LocalDate> timeCol;
    @FXML
    private TableColumn<CustomerEngagementManager5ModelClass, String> headingCol;
    @FXML
    private TableColumn<CustomerEngagementManager5ModelClass, String> descriptionCol;
    @FXML
    private Label label2;
    private ArrayList<CustomerEngagementManager5ModelClass> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        comboBox.getItems().addAll("Local", "National", "International");
        comboBox.setValue("Select");

        headingCol.setCellValueFactory(new PropertyValueFactory<>("heading"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        audienceCol.setCellValueFactory(new PropertyValueFactory<>("audience"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));

    }

    @javafx.fxml.FXML
    public void OnPublishButtonClick(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("CustomerEngagementManager5.bin"));
            for (CustomerEngagementManager5ModelClass u : tableView.getItems())
                oos.writeObject(u);

        } catch (IOException e) {
            label2.setText("Could not save as objects.");
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    @javafx.fxml.FXML
    public void OnBackButtonClick(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerEngagementManagerDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void OnAddButtonClick(ActionEvent actionEvent) {
        String heading = headingTF.getText();
        String description = descriptionTA.getText();
        LocalDate date = datePicker.getValue();
        String audience = comboBox.getValue();

        if (heading.isBlank() || description == null || date == null || audience == null) {
            label2.setText("Enter valid inputs.");
            return;
        } else {
            label2.setText("");
        }

        headingTF.clear();
        descriptionTA.clear();
        datePicker.setValue(null);
        comboBox.setValue(null);

        CustomerEngagementManager5ModelClass u = new CustomerEngagementManager5ModelClass(heading, description, date, audience);
        tableView.getItems().add(u);
        userList.add(u);
    }
}

