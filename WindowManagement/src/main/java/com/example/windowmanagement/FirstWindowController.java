package com.example.windowmanagement;

public class FirstWindowController {

	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}

	public void openNewWindow(){
		System.out.println("Open New Window");
		main.newWindow();
	}


	public void changeWindow(){
		System.out.println("Change window");
		main.changeToSecondWindow();
	}

	
}
