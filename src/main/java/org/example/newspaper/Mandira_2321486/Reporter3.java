package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporter3 {
    @javafx.fxml.FXML
    private TableColumn<Reporter3ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter3ModelClass,String> dateCol;
    @javafx.fxml.FXML
    private ToggleGroup basedReview;
    @javafx.fxml.FXML
    private TextArea reviewTextArea;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TextField articleTextField;
    @javafx.fxml.FXML
    private DatePicker submissionDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Reporter3ModelClass,String> articleCol;
    @javafx.fxml.FXML
    private TextField articleIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Reporter3ModelClass,String> articleIDCol;

    private ArrayList<Reporter3ModelClass> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableView articlesTable;
    @javafx.fxml.FXML
    private TextArea showArticleTextArea;
    @javafx.fxml.FXML
    private Label massageLabel;

    @javafx.fxml.FXML
    public void initialize(){
        articleIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleCol.setCellValueFactory(new PropertyValueFactory<>("article"));
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
        RadioButton reviewButton = (RadioButton) basedReview.getSelectedToggle();
        String review = reviewButton.getText();
    }

    @javafx.fxml.FXML
    public void addCommentButton(ActionEvent actionEvent) throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Editor4Comment.bin"));

            while (true) {
                Reporter3ModelClass u = (Reporter3ModelClass) ois.readObject();
                showArticleTextArea.appendText(u.toString() + "\n");
                if (ois.available() == 0) {
                    break;
                }
            }
        } catch (EOFException e) {
            massageLabel.setText("Successfully loaded objects from file!");
        } catch (ClassNotFoundException e) {
            massageLabel.setText("Bad file format!");
        } catch (IOException e) {
            massageLabel.setText("Could not load from object file!");
        } finally {
            if (ois != null)
                ois.close();
        }
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
    public void reviewArticleButton(ActionEvent actionEvent) {
        String id = articleIDTextField.getText();
        String title = titleTextField.getText();
        String article = articleTextField.getText();
        LocalDate date = submissionDatePicker.getValue();
        String line = id + " , " + title + " , " + date + " , " + article;
        reviewTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void pendingArticleButton(ActionEvent actionEvent) {
        String id = articleIDTextField.getText();
        String title = titleTextField.getText();
        LocalDate date = submissionDatePicker.getValue();
        String article = articleTextField.getText();


        Reporter3ModelClass u = new Reporter3ModelClass(id,title, date, article);
        articlesTable.getItems().addAll(u);
        userList.add(u);
    }

}
