package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Poker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PokerController implements Initializable {

	private Poker p;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void setMainApp(Poker p) {
		this.p = p;
	}

	
	/*
	 * @FXML private void btnButton1Click(ActionEvent event) {
	 * 
	 * System.out.println("Button 1 was clicked");
	 * 
	 * }
	 */
}
