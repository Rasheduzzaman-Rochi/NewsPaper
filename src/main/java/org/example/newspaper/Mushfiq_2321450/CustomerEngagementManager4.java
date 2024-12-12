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

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;


import java.io.*;
import java.time.LocalDate;
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
        int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex == -1) {
            label2.setText("Please select an article to edit!");
            return;
        }

        CustomerEngagementManager3ModelClass selectedSubscription = tableView.getItems().get(selectedIndex);


        String newTitle = titleTF.getText();
        String newDescription = descriptionTA.getText();


        if (newTitle == null || newTitle.trim().isEmpty() || newDescription == null || newDescription.trim().isEmpty()) {
            label2.setText("Title and description cannot be empty!");
            return;
        }


        selectedSubscription.setTitle(newTitle);
        selectedSubscription.setDescription(newDescription);

        tableView.refresh();

        titleTF.clear();
        descriptionTA.clear();
        label2.setText("Article updated successfully!");


    }

    @javafx.fxml.FXML
    public final void OnSaveButtonClick(ActionEvent actionEvent) throws IOException{
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("CustomerEngagementManager3.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (CustomerEngagementManager3ModelClass u : userList) {
                oos.writeObject(u);
            }

            label2.setText("Successfully saved objects to file!");
        } catch (IOException e) {
            label2.setText("Could not save to object file!");
        } finally {
            if (fos!= null)
                fos.close();
        }
    }

    @javafx.fxml.FXML
    public void OnBackButtonClick (ActionEvent actionEvent){
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
    public void OnLoadButtonClick (ActionEvent actionEvent) throws IOException {
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

