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

import java.io.*;
import java.util.ArrayList;

public class CustomerEngagementManager4 {
    @javafx.fxml.FXML
    private TableColumn<CustomerEngagementManager3ModelClass, String> titleCol;
    @javafx.fxml.FXML
    private TableView<CustomerEngagementManager3ModelClass> tableView;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TableColumn<CustomerEngagementManager3ModelClass, String> descriptionCol;


    private ArrayList<CustomerEngagementManager3ModelClass> userList = new ArrayList<>();
    @FXML
    private Label label2;


    @FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));

    }

    @javafx.fxml.FXML
    public void OnEditButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OnSaveButtonClick(ActionEvent actionEvent) {


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
    public void OnLoadButtonClick(ActionEvent actionEvent) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("CustomerEngagementManager3.bin"));

            while (true) {
                CustomerEngagementManager3ModelClass u = (CustomerEngagementManager3ModelClass) ois.readObject();
                tableView.getItems().add(u);
                if (ois.available() == 0) {
                    break;
                }
            }
        } catch (EOFException e) {
            label2.setText("Successfully loaded objects from file!");
        } catch (ClassNotFoundException e) {
            label2.setText("Bad file format!");
        } catch (IOException e) {
            label2.setText("Could not load from object file!");
        } finally {
            if (ois != null)
                ois.close();

        }
    }
}
