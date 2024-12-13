package org.example.newspaper.Rochi_2320366;

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

public class Editor7 {
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass, LocalDate> EditingDLColumn;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass, String> titleColumn;
    @javafx.fxml.FXML
    private TextField idBox;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass, LocalDate> subDLColumn;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass, String> statusColumn;
    @javafx.fxml.FXML
    private DatePicker subDate;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TextField titleBox;
    @javafx.fxml.FXML
    private DatePicker newDate;
    @javafx.fxml.FXML
    private TextField commentBox;
    @javafx.fxml.FXML
    private TableView<Editor7ModelClass> table;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass, String> idColumn;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombo;

    private ArrayList<Editor7ModelClass> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        statusCombo.getItems().addAll("Draft", "Pending", "Published", "Archived");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        subDLColumn.setCellValueFactory(new PropertyValueFactory<>("submiDate"));
        EditingDLColumn.setCellValueFactory(new PropertyValueFactory<>("newDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditorDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onUpdate(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Editor7.bin"));
            for (Object item : table.getItems()) {
                if (item instanceof Editor7ModelClass) {
                    Editor7ModelClass u = (Editor7ModelClass) item;
                    oos.writeObject(u);
                }
            }
            massageLabel.setText("Saved as objects successfully!");
        } catch (IOException e) {
            massageLabel.setText("Could not save as objects.");
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @javafx.fxml.FXML
    public void onSend(ActionEvent actionEvent) {
        String comment = commentBox.getText();

        if (comment.isEmpty()) {
            massageLabel.setText("Please enter a comment!");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Editor7Comment.bin", true))) {
            oos.writeUTF(comment);
            massageLabel.setText("Comment added successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Could not add comment!");
        }
    }

    @FXML
    public void onAdd(ActionEvent actionEvent) {
        String title = titleBox.getText();
        LocalDate SubDate = subDate.getValue();
        LocalDate NewDate = newDate.getValue();
        String id = idBox.getText();
        String Status = statusCombo.getValue();

        Editor7ModelClass u = new Editor7ModelClass(id, title, SubDate, NewDate, Status);
        table.getItems().addAll(u);
        userList.add(u);

        titleBox.clear();
        subDate.valueProperty().set(null);
        idBox.clear();
        newDate.valueProperty().set(null);
        statusCombo.setValue(null);
    }
}