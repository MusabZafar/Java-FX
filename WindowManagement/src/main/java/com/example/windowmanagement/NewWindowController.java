package com.example.windowmanagement;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NewWindowController {
	
	Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	@FXML
    private Button btnClose;

    @FXML
    void closeWindow() {
    		Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }

}