module com.example.windowmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.windowmanagement to javafx.fxml;
    exports com.example.windowmanagement;
}