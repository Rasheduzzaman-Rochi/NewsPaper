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
import java.util.ArrayList;
import java.util.List;

public class Editor1 {
    @FXML
    private Label massageLabel;
    @FXML
    private TableView<Reporter1ModelClass> table;
    @FXML
    private TextArea textArea;
    @FXML
    private TableColumn<Reporter1ModelClass, String> titleColumn;
    @FXML
    private TableColumn<Reporter1ModelClass, LocalDate> dateColumn;
    @FXML
    private TableColumn<Reporter1ModelClass, String> articleColumn;
    @FXML
    private TableColumn<Reporter1ModelClass, String> idColumn;

    private final String reporterFilePath = "Reporter1.bin";

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleColumn.setCellValueFactory(new PropertyValueFactory<>("article"));
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
        }
    }

    @FXML
    public void onSave(ActionEvent actionEvent) throws IOException {
        ObservableList<Reporter1ModelClass> currentItems = table.getItems();
        List<Reporter1ModelClass> fileData = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Reporter1.bin"))) {
            while (true) {
                try {
                    Reporter1ModelClass user = (Reporter1ModelClass) ois.readObject();
                    fileData.add(user);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            massageLabel.setText("Error reading existing data.");
            return;
        }

        for (Reporter1ModelClass newItem : currentItems) {
            fileData.removeIf(existingItem -> existingItem.getId().equals(newItem.getId()));
            fileData.add(newItem);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Reporter1.bin"))) {
            for (Reporter1ModelClass updatedItem : fileData) {
                oos.writeObject(updatedItem);
            }
            massageLabel.setText("Data saved successfully with updates.");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Could not save Data.");
        }
    }


    @FXML
    public void onEditArticle(ActionEvent actionEvent) {
        int selectedIndex = table.getSelectionModel().getSelectedIndex();
        if (selectedIndex == -1) {
            massageLabel.setText("Please select an article to edit!");
            return;
        }

        Reporter1ModelClass selectedArticle = table.getItems().get(selectedIndex);
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
}