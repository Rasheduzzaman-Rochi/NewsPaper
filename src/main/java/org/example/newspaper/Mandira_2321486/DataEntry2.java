package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class DataEntry2 {
    @javafx.fxml.FXML
    private TableColumn<DataEntry2ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<DataEntry2ModelClass,LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableView<DataEntry2ModelClass> articlesTable;
    @javafx.fxml.FXML
    private TableColumn<DataEntry2ModelClass,String> categoryCol;
    @javafx.fxml.FXML
    private ComboBox<String> filterCategoryComboBox;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TextArea showArticle;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    private ArrayList<DataEntry2ModelClass> userList = new ArrayList<>();
    private ArrayList<DataEntry2ModelClass> filtercategory = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize(){
        categoryComboBox.getItems().addAll("Sports","Politics","Economy","Education" ,"Lifestyle","Crime","Technology");
        filterCategoryComboBox.getItems().addAll("Sports","Politics","Economy","Education" ,"Lifestyle","Crime","Technology");

        //Table
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
    }



    @javafx.fxml.FXML
    public void organizeArticleButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        LocalDate date = datePicker.getValue();
        String category = categoryComboBox.getValue();


        DataEntry2ModelClass u = new DataEntry2ModelClass(title, date,category);
        articlesTable.getItems().addAll(u);
        userList.add(u);

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DataEntryDash.fxml"));
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
        String title = titleTextField.getText();
        LocalDate date =datePicker.getValue();
        String category = categoryComboBox.getValue();
        String line = title  + " , " +date +" , "+ category;
        showArticle.appendText(line);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        massageLabel.setText("Data saved successfully");
    }

    @javafx.fxml.FXML
    public void filterByCategory(ActionEvent actionEvent) {
        String filterByCategory = filterCategoryComboBox.getValue();
        filtercategory.clear();
        for (DataEntry2ModelClass c :userList ) {
            if (c.getCategory().equals(filterByCategory)) {
                filtercategory.add(c);

            }
        }
        System.out.println(articlesTable.toString());
        System.out.println(filtercategory.toString());

        articlesTable.getItems().clear();
        articlesTable.getItems().addAll(filtercategory);
    }
}
