package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
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

public class Reporter5 {
    @javafx.fxml.FXML
    private ListView notesList;
    @javafx.fxml.FXML
    private TableColumn<Reporter5ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter5ModelClass,LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TextField articleTextField;
    @javafx.fxml.FXML
    private TableColumn<Reporter5ModelClass,String> sourceCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField sourceTextField;
    @javafx.fxml.FXML
    private TableColumn<Reporter5ModelClass,String> articleCol;

    private ArrayList<Reporter5ModelClass> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableView table;
    @javafx.fxml.FXML
    private Label massageLabel;

    @javafx.fxml.FXML
    private void initialize(){
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleCol.setCellValueFactory(new PropertyValueFactory<>("article"));
        sourceCol.setCellValueFactory(new PropertyValueFactory<>("source"));
    }

    @javafx.fxml.FXML
    public void addNotesButton(ActionEvent actionEvent) {
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
    public void saveArticleButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        LocalDate date = datePicker.getValue();
        String article = articleTextField.getText();
        String source = sourceTextField.getText();


        Reporter5ModelClass u = new Reporter5ModelClass(title, date, article,source);
        table.getItems().addAll(u);
        userList.add(u);

    }

    @javafx.fxml.FXML
    public void showContentButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        LocalDate date = datePicker.getValue();
        String article = articleTextField.getText();
        String source = sourceTextField.getText();
        String line = title + " , " + date + " , " + article + " , " + source;
        contentTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {

    }

}
