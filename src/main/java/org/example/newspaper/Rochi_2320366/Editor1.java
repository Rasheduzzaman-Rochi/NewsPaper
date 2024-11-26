package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Editor1 {

    @javafx.fxml.FXML
    private ComboBox statusComboBox;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableView table;
    @FXML
    private TextArea textArea;
    @FXML
    private TableColumn titleColumn;
    @FXML
    private TableColumn statusColumn;
    @FXML
    private TableColumn dateColumn;
    @FXML
    private TableColumn idColumn;

    @FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Approve for Print", "Needs Revision");
    }

    @javafx.fxml.FXML
    public void onBack(ActionEvent actionEvent) {
    }

    @FXML
    public void onSave(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onConfirm(ActionEvent actionEvent) {
    }

    @FXML
    public void onEditArticle(ActionEvent actionEvent) {
    }

}
