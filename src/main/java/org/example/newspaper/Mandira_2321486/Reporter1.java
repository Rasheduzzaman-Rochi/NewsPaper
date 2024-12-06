package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporter1 {

    @javafx.fxml.FXML
    private TableColumn titleCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn articleIDCol;
    @javafx.fxml.FXML
    private TableView table;
    @javafx.fxml.FXML
    private TextArea summaryTextArea;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private DatePicker submissionDatePicker;
    @javafx.fxml.FXML
    private Label massageLabel;

    private ArrayList<Reporter1ModelClass> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn articleCol;
    @javafx.fxml.FXML
    private TextField articleTextField;

    @javafx.fxml.FXML
    public void initialize() {
        articleIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleCol.setCellValueFactory(new PropertyValueFactory<>("article"));

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
    public void addInformationButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        String id = idTextField.getText();
        String article = articleTextField.getText();
        LocalDate date = submissionDatePicker.getValue();
        String line = title +" , " + id +" , "+ date +" , " + article ;
        summaryTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) throws IOException {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("Reporter1.txt"));

            for (Reporter1ModelClass u : userList) {
                bw.write(u.getId() + "," + u.getTitle() + "," + u.getDate() + u.getArticle()+ "\n");
            }

        } catch (IOException e) {
            massageLabel.setText("could not save file!");
            e.printStackTrace();
        } finally {
            if (bw != null)
                bw.close();
        }
    }

    @javafx.fxml.FXML
    public void addUserButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        LocalDate date = submissionDatePicker.getValue();
        String id = idTextField.getText();
        String article = articleTextField.getText();


        Reporter1ModelClass u = new Reporter1ModelClass(title,id,date,article);
        table.getItems().addAll(u);
        userList.add(u);


    }
}
