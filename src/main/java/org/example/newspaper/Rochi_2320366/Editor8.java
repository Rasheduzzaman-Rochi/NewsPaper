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

public class Editor8 {
    @FXML
    private TableColumn<Editor8ModelClass, String> updateColumn;
    @FXML
    private TextField idBox;
    @FXML
    private DatePicker updateDateBox;
    @FXML
    private TableColumn<Editor8ModelClass, String> titleColumn;
    @FXML
    private ComboBox<String> statusComboBox;
    @FXML
    private TableColumn<Editor8ModelClass, String> statusColumn;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private TextField titleBox;
    @FXML
    private TextArea commentBox;
    @FXML
    private TableView<Editor8ModelClass> table;
    @FXML
    private TableColumn<Editor8ModelClass, String> idColumn;

    private final ArrayList<Editor8ModelClass> userList = new ArrayList<>();
    @FXML
    private Label massageLabel;

    @FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Draft", "Pending", "Published");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        updateColumn.setCellValueFactory(new PropertyValueFactory<>("updateDate"));
    }

    @FXML
    public void onBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditorDash.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Error: Unable to load the dashboard.");
        }
    }

    @FXML
    public void onSave(ActionEvent actionEvent) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Editor8.bin"))) {
            for (Editor8ModelClass item : table.getItems()) {
                oos.writeObject(item);
            }
            massageLabel.setText("Data saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Error: Unable to save data.");
        }
    }

    @FXML
    public void onGenerate() {
        int totalItems = table.getItems().size();
        if (totalItems == 0) {
            progressBar.setProgress(0.0);
            massageLabel.setText("No items in the table.");
            return;
        }

        long publishedCount = table.getItems().stream()
                .filter(item -> "Published".equalsIgnoreCase(item.getStatus()))
                .count();

        double progress = (double) publishedCount / totalItems;
        progressBar.setProgress(progress);
        massageLabel.setText("Progress updated.");
    }

    @FXML
    public void onSent(ActionEvent actionEvent) {
        String comment = commentBox.getText().trim();

        if (comment.isEmpty()) {
            massageLabel.setText("Please enter a comment!");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Editor8Comment.bin", true))) {
            oos.writeUTF(comment);
            massageLabel.setText("Comment added successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Error: Unable to save comment.");
        }
    }

    @FXML
    public void onAdd(ActionEvent actionEvent) {
        String title = titleBox.getText().trim();
        LocalDate date = updateDateBox.getValue();
        String id = idBox.getText().trim();
        String status = statusComboBox.getValue();

        if (title.isEmpty() || id.isEmpty() || date == null || status == null) {
            massageLabel.setText("Please fill in all fields!");
            return;
        }

        Editor8ModelClass newItem = new Editor8ModelClass(id, title, status, date);
        table.getItems().add(newItem);
        userList.add(newItem);

        titleBox.clear();
        idBox.clear();
        updateDateBox.setValue(null);
        statusComboBox.setValue(null);
    }
}
