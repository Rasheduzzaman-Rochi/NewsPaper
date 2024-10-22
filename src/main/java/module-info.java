module org.example.newspaper {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.newspaper to javafx.fxml;
    exports org.example.newspaper;
}