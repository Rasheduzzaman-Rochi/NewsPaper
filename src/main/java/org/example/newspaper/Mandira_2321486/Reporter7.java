package org.example.newspaper.Mandira_2321486;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Reporter7 {
    @javafx.fxml.FXML
    private TableView meetingTable;
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableColumn agendaCol;
    @javafx.fxml.FXML
    private TableColumn timeCol;
    @javafx.fxml.FXML
    private TextArea summaryTextArea;

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
    }

    @javafx.fxml.FXML
    public void notifyTeamMemberButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void joinMeetingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void meetingSchedulerButton(ActionEvent actionEvent) {
    }
}
