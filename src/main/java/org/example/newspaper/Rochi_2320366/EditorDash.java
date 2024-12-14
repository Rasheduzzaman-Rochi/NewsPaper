package org.example.newspaper.Rochi_2320366;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.newspaper.LoginApplication;

import java.io.IOException;

public class EditorDash {
    @javafx.fxml.FXML
    private TableColumn status;
    @javafx.fxml.FXML
    private TableColumn campaignName1;
    @javafx.fxml.FXML
    private TableColumn campaignName2;
    @javafx.fxml.FXML
    private AnchorPane endDate;
    @javafx.fxml.FXML
    private TableColumn startdate;
    @javafx.fxml.FXML
    private TableView tableview2;
    @javafx.fxml.FXML
    private TableView tableview1;
    @javafx.fxml.FXML
    private TableColumn conversionRate;
    @javafx.fxml.FXML
    private TableColumn subscriptionGained;
    @javafx.fxml.FXML
    private BarChart barchart;
    @javafx.fxml.FXML
    private TableColumn engagementRate;
    @javafx.fxml.FXML
    private TableColumn targetaudience;
    @javafx.fxml.FXML
    private TableColumn enddate;
    @javafx.fxml.FXML
    private TextField targetAudience;
    @javafx.fxml.FXML
    private CheckBox checkbox;
    @javafx.fxml.FXML
    private TextField campaignName;
    @javafx.fxml.FXML
    private DatePicker startDate;
    @javafx.fxml.FXML
    private TextArea textArea;

    @Deprecated
    public void onTrack(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor8.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onEdit(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor1.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onEditHeadlines(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor2.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onFactualAccuracy(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor3.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onManageDeadlines(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor7.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onProofread(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor6.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onCollaborate(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor5.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onCoordinate(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Editor4.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void onLogout(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @Deprecated
    public void submitButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void showButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void logoutButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void launchCampaign(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createnewcampaign(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportPerformanceReport(ActionEvent actionEvent) {
    }
}