package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporter4 {
    @javafx.fxml.FXML
    private TableColumn<Reporter4ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter4ModelClass,LocalDate> dateCol;
    @javafx.fxml.FXML
    private ImageView image;
    @javafx.fxml.FXML
    private TableColumn<Reporter4ModelClass,String> idCol;
    @javafx.fxml.FXML
    private TableView<Reporter4ModelClass> table;
    @javafx.fxml.FXML
    private TableColumn<Reporter4ModelClass,String> articleCol;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TextField articleTextField;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField articleIDTextField;

    private ArrayList<Reporter4ModelClass> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private TextArea showTextArea;

    @javafx.fxml.FXML
    public void initialize(){
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        articleCol.setCellValueFactory(new PropertyValueFactory<>("article"));
    }

    @javafx.fxml.FXML
    public void notifyDesignTeamButton(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("LayoutDesigner3.bin"));
            for (Reporter4ModelClass u: table.getItems())
                oos.writeObject(u);

        }
        catch (IOException e) {
            massageLabel.setText("Could not save as objects.");
            e.printStackTrace();
        }
        finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
    public void visualMaterialsButton(ActionEvent actionEvent) {
        String id = articleIDTextField.getText();
        String title = titleTextField.getText();
        String article = articleTextField.getText();
        LocalDate date = datePicker.getValue();

        Reporter4ModelClass u = new Reporter4ModelClass(id,title, date, article);
        table.getItems().addAll(u);
        userList.add(u);
    }

    @javafx.fxml.FXML
    public void attachImageButton(ActionEvent actionEvent) {
    }
}
