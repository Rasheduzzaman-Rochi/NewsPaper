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

import java.io.*;
import java.time.LocalDate;

public class Editor1 {
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableView table;
    @FXML
    private TextArea textArea;
    @FXML
    private TableColumn titleColumn;
    @FXML
    private TableColumn dateColumn;
    @FXML
    private TableColumn articleColumn;
    @FXML
    private TableColumn idColumn;

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

    @FXML
    public void onSave(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onConfirm(ActionEvent actionEvent) {
    }

    @FXML
    public void onEditArticle(ActionEvent actionEvent) {
        String id = idColumn.getCellData(table.getSelectionModel().getSelectedIndex()).toString();
        String title = titleColumn.getCellData(table.getSelectionModel().getSelectedIndex()).toString();
        LocalDate date = LocalDate.parse(dateColumn.getCellData(table.getSelectionModel().getSelectedIndex()).toString());
        String article = articleColumn.getCellData(table.getSelectionModel().getSelectedIndex()).toString();
        String line = id + " , " + title + " , " + date + " , " + article;
        textArea.appendText(line);
    }

    @FXML
    public void onLoad(ActionEvent actionEvent) {
        table.getItems().clear();

        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader("Reporter1.txt");
            br = new BufferedReader(fr);

            while (true) {
                String line = br.readLine();
                if (line == null) break;

                String[] data = line.split(",");
                Reporter1ModelClass user = new Reporter1ModelClass(data[0], data[1], LocalDate.parse(data[2]), data[3]);
                table.getItems().add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}