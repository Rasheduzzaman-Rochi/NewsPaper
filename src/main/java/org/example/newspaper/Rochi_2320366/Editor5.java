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
import org.example.newspaper.Mandira_2321486.Reporter1ModelClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Editor5 {
    @javafx.fxml.FXML
    private TextField IdBox;
    @javafx.fxml.FXML
    private ComboBox<String> categoryBox;
    @javafx.fxml.FXML
    private TableColumn<Editor5ModelClass,String> categoryColumn;
    @javafx.fxml.FXML
    private ComboBox<String> priorityComboBox;
    @javafx.fxml.FXML
    private TableColumn<Editor5ModelClass,String> priorityColumn;
    @javafx.fxml.FXML
    private TableColumn<Editor5ModelClass,String> titleColumn;
    @javafx.fxml.FXML
    private TableColumn<Editor5ModelClass,String> articleIDColumn;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TextField titleBox;
    @javafx.fxml.FXML
    private TableColumn<Editor5ModelClass,LocalDate> dateColumn;
    @javafx.fxml.FXML
    private DatePicker dateBox;
    @javafx.fxml.FXML
    private TableView<Editor5ModelClass> table;
    @javafx.fxml.FXML
    private TextArea textArea;

    private ArrayList<Editor5ModelClass> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        categoryBox.getItems().addAll("Sports", "Business", "Technology", "Politics", "Entertainment");
        priorityComboBox.getItems().addAll("Low", "Medium", "High");
        articleIDColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        priorityColumn.setCellValueFactory(new PropertyValueFactory<>("priority"));
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
    public void onConfirm(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Editor5.bin"));
            for (Object item : table.getItems()) {
                if (item instanceof Editor5ModelClass) {
                    Editor5ModelClass u = (Editor5ModelClass) item;
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
    public void onSent(ActionEvent actionEvent){
        String comment = textArea.getText();

        if (comment.isEmpty()) {
            massageLabel.setText("Please enter a comment!");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Editor5Comment.bin", true))) {
            oos.writeUTF(comment);
            massageLabel.setText("Comment added successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Could not add comment!");
        }
    }

    @javafx.fxml.FXML
    public void onAdd(ActionEvent actionEvent) {
        String title = titleBox.getText();
        LocalDate date = dateBox.getValue();
        String id = IdBox.getText();
        String category = categoryBox.getValue();
        String priority = priorityComboBox.getValue();

        Editor5ModelClass u = new Editor5ModelClass(id, title, category, date, priority);
        table.getItems().addAll(u);
        userList.add(u);

        titleBox.clear();
        dateBox.valueProperty().set(null);
        IdBox.clear();
        categoryBox.setValue(null);
        priorityComboBox.setValue(null);
    }
}
