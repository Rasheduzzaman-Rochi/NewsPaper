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

public class ContentManager1 {
    @javafx.fxml.FXML
    private TableColumn<ContentManagerModelClass1,String> titleColumn;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<ContentManagerModelClass1,String> statusColumn;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableColumn<ContentManagerModelClass1, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableView<ContentManagerModelClass1> table;
    @javafx.fxml.FXML
    private TableColumn<ContentManagerModelClass1,String> idColumn;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField articleTextField;
    @javafx.fxml.FXML
    private TableColumn<ContentManagerModelClass1,String> categoryColumn;
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private TextField titleBox;
    @javafx.fxml.FXML
    private DatePicker dateBox;
    @javafx.fxml.FXML
    private TableColumn<ContentManagerModelClass1,String> articleColumn;

    private ArrayList<ContentManagerModelClass1> userList = new ArrayList<>();

    @FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Draft", "Pending", "Published");
        categoryComboBox.getItems().addAll("Sports", "Business", "Technology", "Politics", "Entertainment");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        articleColumn.setCellValueFactory(new PropertyValueFactory<>("article"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ContentManagerDash.fxml"));
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
            oos = new ObjectOutputStream(new FileOutputStream("ContentManager1.bin"));
            for (Object item : table.getItems()) {
                if (item instanceof ContentManagerModelClass1) {
                    ContentManagerModelClass1 u = (ContentManagerModelClass1) item;
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
    public void onAdd(ActionEvent actionEvent) {
        String title = titleBox.getText();
        LocalDate date = dateBox.getValue();
        String id = idTextField.getText();
        String article = articleTextField.getText();
        String category = categoryComboBox.getValue();
        String status = statusComboBox.getValue();

        ContentManagerModelClass1 u = new ContentManagerModelClass1(id, title, article,date, category, status);
        table.getItems().addAll(u);
        userList.add(u);

        titleBox.clear();
        dateBox.valueProperty().set(null);
        idTextField.clear();
        articleTextField.clear();
        categoryComboBox.setValue(null);
        statusComboBox.setValue(null);
    }
}