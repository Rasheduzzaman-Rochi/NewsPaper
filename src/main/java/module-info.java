module org.example.newspaper {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.newspaper to javafx.fxml;
    exports org.example.newspaper;
    exports org.example.newspaper.Rochi_2320366;
    opens org.example.newspaper.Rochi_2320366 to javafx.fxml;
    exports org.example.newspaper.Arong_2321464;
    opens org.example.newspaper.Arong_2321464 to javafx.fxml;
}