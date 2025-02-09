package org.example.newspaper.Mushfiq_2321450;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class CustomerEngagementManager1 {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label dateLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label headingLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTF;
    @FXML
    private TableColumn<CustomerEngagementManager1ModelClass, String> audienceCol;
    @FXML
    private TableView<CustomerEngagementManager1ModelClass> tableView;
    @FXML
    private TextField descriptionTF;
    @FXML
    private TableColumn<CustomerEngagementManager1ModelClass, String> descriptionCol;
    @FXML
    private TableColumn<CustomerEngagementManager1ModelClass, LocalDate> dateCol;
    @FXML
    private TableColumn<CustomerEngagementManager1ModelClass, String> nameCol;

    private ArrayList<CustomerEngagementManager1ModelClass> userList = new ArrayList<>();
    @FXML
    private Label onAddLabel;

    @FXML
    public void initialize() {
        comboBox.getItems().addAll("General", "Sports", "Business", "Technology");
        comboBox.setValue("Select");

        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        audienceCol.setCellValueFactory(new PropertyValueFactory<>("audience"));


    }

    @FXML
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
    void OnLaunchButtonClick(ActionEvent actionEvent) throws IOException {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("CustomerEngagementManager1.bin"));
            for (CustomerEngagementManager1ModelClass u : tableView.getItems())
                oos.writeObject(u);

        } catch (IOException e) {
            onAddLabel.setText("Could not save as objects.");
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    @FXML
    public void OnAddButtonClick(ActionEvent actionEvent) {
        String name = nameTF.getText();
        String description = descriptionTF.getText();
        LocalDate date = datePicker.getValue();
        String audience = comboBox.getValue();

        if (name.isBlank() || description == null || date == null || audience == null) {
            onAddLabel.setText("Enter valid inputs.");
            return;
        } else {
            onAddLabel.setText("");
        }

        nameTF.clear();
        descriptionTF.clear();
        datePicker.setValue(null);
        comboBox.setValue(null);

        CustomerEngagementManager1ModelClass u = new CustomerEngagementManager1ModelClass(name, description, date, audience);
        tableView.getItems().add(u);
        userList.add(u);
    }

}




