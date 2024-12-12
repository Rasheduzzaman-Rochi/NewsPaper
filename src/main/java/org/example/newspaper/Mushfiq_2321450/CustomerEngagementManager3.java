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
import org.example.newspaper.Mandira_2321486.Reporter2ModelClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CustomerEngagementManager3 {

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Label label1;

    @FXML
    private TextField titleTF;
    @FXML
    private Label OnAddLabel;
    @FXML
    private TableColumn<CustomerEngagementManager3ModelClass, String> titleCol;
    @FXML
    private TableView<CustomerEngagementManager3ModelClass> tableView;
    @FXML
    private TableColumn<CustomerEngagementManager3ModelClass, String> descriptionCol;

    private ArrayList<CustomerEngagementManager3ModelClass> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));


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
    void OnUpdateButtonClick(ActionEvent event) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("CustomerEngagementManager3.bin"));
            for (CustomerEngagementManager3ModelClass u : tableView.getItems()) {
                oos.writeObject(u);
            }
            OnAddLabel.setText("Successfully updated objects.");
        } catch (IOException e) {
            OnAddLabel.setText("Could not save as objects.");
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

    @FXML
    public void OnSaveButtonClick(ActionEvent actionEvent) {
        String title = titleTF.getText();
        String description = descriptionTextArea.getText();


        if (title.isBlank() || description == null) {
            OnAddLabel.setText("Enter valid inputs.");
            return;


        } else {
            OnAddLabel.setText("Successfully saved.");

        }

        titleTF.clear();
        descriptionTextArea.clear();

        CustomerEngagementManager3ModelClass u = new CustomerEngagementManager3ModelClass(title, description);
        tableView.getItems().add(u);
        userList.add(u);

    }
}