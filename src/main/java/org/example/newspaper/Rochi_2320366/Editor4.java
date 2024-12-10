package org.example.newspaper.Rochi_2320366;

import javafx.collections.ObservableList;
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

import java.io.*;
import java.time.LocalDate;

public class Editor4 {
    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass,String> titleColumn;
    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass,String> articleColumn;
    @javafx.fxml.FXML
    private TableView<Reporter1ModelClass> table;
    @javafx.fxml.FXML
    private TableColumn<Reporter1ModelClass,String> idColumn;
    @javafx.fxml.FXML
    private TextField notifyBox;
    @javafx.fxml.FXML
    private Label masssageLabel;
    @javafx.fxml.FXML
    private TextArea textArea;

    private final String reporterFilePath = "Reporter1.bin";

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleColumn.setCellValueFactory(new PropertyValueFactory<>("article"));
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
    public void onSave(ActionEvent actionEvent) throws IOException {
        ObservableList<Reporter1ModelClass> currentItems = table.getItems();
        String comment = notifyBox.getText();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Reporter1.bin"))) {
            for (Reporter1ModelClass item : currentItems) {
                oos.writeObject(item);
            }

            if (comment.isEmpty()) {
                masssageLabel.setText("Data saved successfully with updates.");
            } else {
                masssageLabel.setText("Data saved successfully with updates. Comment: " + comment);
            }

        } catch (IOException e) {
            e.printStackTrace();
            masssageLabel.setText("Could not save Data.");
        }
    }

    @javafx.fxml.FXML
    public void onConfirm(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSent(ActionEvent actionEvent) {
        String comment = notifyBox.getText();

        if (comment.isEmpty()) {
            masssageLabel.setText("Please enter a comment!");
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Editor4.bin", true))) {
            oos.writeUTF(comment);
            masssageLabel.setText("Comment added successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            masssageLabel.setText("Could not add comment!");
        }
    }

    @FXML
    public void onEdit(ActionEvent actionEvent) {
        int selectedIndex = table.getSelectionModel().getSelectedIndex();
        if (selectedIndex == -1) {
            masssageLabel.setText("Please select an article to edit!");
            return;
        }

        Reporter1ModelClass selectedArticle = (Reporter1ModelClass) table.getItems().get(selectedIndex);
        String id = selectedArticle.getId();
        String title = selectedArticle.getTitle();
        LocalDate date = selectedArticle.getDate();
        String article = selectedArticle.getArticle();

        String line = id + ", " + title + ", " + date + ", " + article;
        textArea.setText(line);
    }

    @FXML
    public void onLoad(ActionEvent actionEvent) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(reporterFilePath));

            while (true) {
                Reporter1ModelClass u = (Reporter1ModelClass) ois.readObject();
                table.getItems().add(u);
                if (ois.available() == 0) {
                    break;
                }
            }
        } catch (EOFException e) {
            masssageLabel.setText("Successfully loaded objects from file!");
        } catch (ClassNotFoundException e) {
            masssageLabel.setText("Bad file format!");
        } catch (IOException e) {
            masssageLabel.setText("Could not load from object file!");
        } finally {
            if (ois != null)
                ois.close();
        }
    }
}