package com.example.windowmanagement;

public class SecondWindowController {

	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	public void goBack(){
System.out.println("Go Back");
main.firstWindow();
	}

}
