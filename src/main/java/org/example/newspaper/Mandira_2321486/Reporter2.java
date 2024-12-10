package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
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

public class Reporter2 {

    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private TextArea contentTextArea;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TextField subTitleTextField;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> categoryCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> subTitleCol;
    @javafx.fxml.FXML
    private TableColumn<Reporter2ModelClass,String> articleIDCol;
    @javafx.fxml.FXML
    private ComboBox<String> filterCategoryComboBox;
    @javafx.fxml.FXML
    private TableView<Reporter2ModelClass> table;
    @javafx.fxml.FXML
    private TextField articleIDTextField;

    private ArrayList<Reporter2ModelClass> userList = new ArrayList<>();
    private ArrayList<Reporter2ModelClass> filtercategory = new ArrayList<>();
    @javafx.fxml.FXML
    private Label massageLabel;

    @javafx.fxml.FXML
    public void initialize(){
        categoryComboBox.getItems().addAll("Sports","Politics","Economy","Education" ,"Lifestyle","Crime","Technology");
        filterCategoryComboBox.getItems().addAll("Sports","Politics","Economy","Education" ,"Lifestyle","Crime","Technology");

        //Table
        articleIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        subTitleCol.setCellValueFactory(new PropertyValueFactory<>("subtitle"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Reporter1.bin"));
            for (Reporter2ModelClass u: table.getItems())
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
    public void showButton(ActionEvent actionEvent) {
        String id = articleIDTextField.getText();
        String title = titleTextField.getText();
        String subtitle = subTitleTextField.getText();
        String category = categoryComboBox.getValue();
        String line = id + " , " + title + " , " + subtitle + " , " + category;
        contentTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        String id = articleIDTextField.getText();
        String title = titleTextField.getText();
        String subtitle = subTitleTextField.getText();
        String category = categoryComboBox.getValue();


        Reporter2ModelClass u = new Reporter2ModelClass(id, title, subtitle, category);
        table.getItems().addAll(u);
        userList.add(u);

        articleIDTextField.clear();
        titleTextField.clear();
        subTitleTextField.clear();
        categoryComboBox.valueProperty().set(null);
    }

    @javafx.fxml.FXML
    public void filterByCategory(ActionEvent actionEvent) {
        String filterByCategory = filterCategoryComboBox.getValue();
        filtercategory.clear();
        for (Reporter2ModelClass c :userList ) {
            if (c.getCategory().equals(filterByCategory)) {
                filtercategory.add(c);

            }
        }
        System.out.println(table.toString());
        System.out.println(filtercategory.toString());

        table.getItems().clear();
        table.getItems().addAll(filtercategory);
    }
}
