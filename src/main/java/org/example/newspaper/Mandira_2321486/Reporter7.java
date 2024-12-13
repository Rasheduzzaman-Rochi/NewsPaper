package org.example.newspaper.Mandira_2321486;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.newspaper.Rochi_2320366.Editor7ModelClass;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reporter7 {
    @javafx.fxml.FXML
    private TextArea summaryTextArea;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass,String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass,LocalDate> subDLCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombo;
    @javafx.fxml.FXML
    private DatePicker editingDatePicker;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass,String> idCol;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass,String> statusCol;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TableColumn<Editor7ModelClass, LocalDate> editingDLCol;
    @javafx.fxml.FXML
    private DatePicker subDatePicker;
    @javafx.fxml.FXML
    private TableView<Editor7ModelClass> table;

    private ArrayList<Editor7ModelClass> userList = new ArrayList<>();

    @javafx.fxml.FXML
    private void initialize(){
        statusCombo.getItems().addAll("Draft", "Pending", "Published", "Archived");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        subDLCol.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
        editingDLCol.setCellValueFactory(new PropertyValueFactory<>("newDate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
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
    public void saveButton(ActionEvent actionEvent) {
        String id = idTextField.getText();
        String title = titleTextField.getText();
        LocalDate submiDate = subDatePicker.getValue();
        LocalDate newDate = editingDatePicker.getValue();
        String line = id + " , " + title + " , " + submiDate + " , " + newDate;
        summaryTextArea.appendText(line);
    }

    @javafx.fxml.FXML
    public void notifyTeamMemberButton(ActionEvent actionEvent) throws IOException{
        ObservableList<Editor7ModelClass> currentItems = table.getItems();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Reporter2.bin"))) {
            for (Editor7ModelClass item : currentItems) {
                oos.writeObject(item);
            }
            massageLabel.setText("Data saved successfully with updates.");
        } catch (IOException e) {
            e.printStackTrace();
            massageLabel.setText("Could not save Data.");
        }
    }

    @javafx.fxml.FXML
    public void joinMeetingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Editor7.bin"));

            while (true) {
                Editor7ModelClass u = (Editor7ModelClass) ois.readObject();
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
