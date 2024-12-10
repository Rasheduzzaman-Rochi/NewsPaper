package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporter1 {

    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass,LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass,String> articleIDCol;
    @javafx.fxml.FXML
    private TableView<Reporter1ModelClass> table;
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
        String line = id + " , " + title + " , " + date + " , " + article;
        summaryTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Reporter1.bin"));
            for (Reporter1ModelClass u: table.getItems())
                oos.writeObject(u);

        }
        catch (IOException e) {
            massageLabel.setText("Could not save as objects.");
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
    public void addUserButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        LocalDate date = submissionDatePicker.getValue();
        String id = idTextField.getText();
        String article = articleTextField.getText();


        Reporter1ModelClass u = new Reporter1ModelClass(id,title, date, article);
        table.getItems().addAll(u);
        userList.add(u);
    }
}
