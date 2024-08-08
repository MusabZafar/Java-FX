module com.example.mypane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mypane to javafx.fxml;
    exports com.example.mypane;
}