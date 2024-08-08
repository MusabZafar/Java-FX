module com.example.samplefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samplefx to javafx.fxml;
    exports com.example.samplefx;
}