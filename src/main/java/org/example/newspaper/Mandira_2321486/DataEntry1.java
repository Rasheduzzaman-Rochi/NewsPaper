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

public class DataEntry1 {
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<DataEntry1ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<DataEntry1ModelClass,LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn<DataEntry1ModelClass,String> idCol;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private DatePicker submissionDatePicker;
    @javafx.fxml.FXML
    private TableView<DataEntry1ModelClass> table;

    private ArrayList<DataEntry1ModelClass> userList = new ArrayList<>();

    @javafx.fxml.FXML
    private void initialize(){
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @javafx.fxml.FXML
    public void saveArticleButton(ActionEvent actionEvent) {
        String id = idTextField.getText();
        String title = titleTextField.getText();
        LocalDate date = submissionDatePicker.getValue();


        DataEntry1ModelClass u = new DataEntry1ModelClass(id,title, date);
        table.getItems().addAll(u);
        userList.add(u);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DataEntryDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        String id = idTextField.getText();
        LocalDate date = submissionDatePicker.getValue();
        String line = id + " , " + title + " , " + date ;
        contentTextArea.appendText(line);

        massageLabel.setText("Successfully show data");
    }

    
}
