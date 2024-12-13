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

public class CustomerEngagementManager6 {
    @javafx.fxml.FXML
    private TableColumn<CustomerEngagementManager6ModelClass, Integer> idCol;
    @javafx.fxml.FXML
    private TextField contentTF;
    @javafx.fxml.FXML
    private TableView<CustomerEngagementManager6ModelClass> tableView;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private Label label1;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private Label label2;
    @javafx.fxml.FXML
    private TableColumn<CustomerEngagementManager6ModelClass, String> groupCol;
    @javafx.fxml.FXML
    private Label onAddLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerEngagementManager6ModelClass, String> trainingContentCol;
    @javafx.fxml.FXML
    private TableColumn<CustomerEngagementManager6ModelClass, String> descriptionCol;


    @FXML
    private void initialize() {
        comboBox.getItems().addAll("A", "B", "C");
        comboBox.setValue("Group");

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        groupCol.setCellValueFactory(new PropertyValueFactory<>("group"));
        trainingContentCol.setCellValueFactory(new PropertyValueFactory<>("trainingContent"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));

    }

    @javafx.fxml.FXML
    public void OnAssignButtonClick(ActionEvent actionEvent) throws IOException{
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("CustomerEngagementManager6.bin"));
            for (CustomerEngagementManager6ModelClass u : tableView.getItems()) {
                oos.writeObject(u);
            }
            onAddLabel.setText("Successfully updated objects.");
        } catch (IOException e) {
            onAddLabel.setText("Could not save as objects.");
            e.printStackTrace();
        }
        finally {
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


    @javafx.fxml.FXML
    public void OnAddButtonClick(ActionEvent actionEvent) {
        String group = comboBox.getValue();
        String trainingContent = contentTF.getText();
        String description = descriptionTA.getText();
        Integer id;


        try {
            id = Integer.parseInt(idTF.getText());
        } catch (NumberFormatException e) {
            onAddLabel.setText("Enter a valid integer ID.");
            return;
        }

        if (trainingContent.isBlank() || description == null || group == null) {
            onAddLabel.setText("Enter valid inputs.");
            return;
        } else {
            onAddLabel.setText("");
        }

        contentTF.clear();
        descriptionTA.clear();
        idTF.clear();
        comboBox.setValue("Group");

        CustomerEngagementManager6ModelClass u = new CustomerEngagementManager6ModelClass(id, group, trainingContent, description);
        tableView.getItems().add(u);
    }

}
