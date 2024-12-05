module org.example.newspaper {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;



   opens org.example.newspaper to javafx.fxml;
   exports org.example.newspaper;
   exports org.example.newspaper.Rochi_2320366;
   opens org.example.newspaper.Rochi_2320366 to javafx.fxml;
   exports org.example.newspaper.Arong_2321464;
   opens org.example.newspaper.Arong_2321464 to javafx.fxml;
   exports org.example.newspaper.Mandira_2321486;
   opens org.example.newspaper.Mandira_2321486 to javafx.fxml;
   exports org.example.newspaper.Mushfiq_2321450;
   opens org.example.newspaper.Mushfiq_2321450 to javafx.fxml;
}