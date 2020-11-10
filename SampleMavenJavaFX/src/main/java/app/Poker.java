package app;
 
import java.io.IOException;

import app.controller.PokerController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Poker extends Application {

	
	private Stage primaryStage;
	private BorderPane PokerScreen = null;
	private PokerController PC = null;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		ShowScreen();
		
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	public void ShowScreen() {
		// Parent root;
		try {

			FXMLLoader loader = new FXMLLoader();
			loader = new FXMLLoader(getClass()
					.getResource("/app/view/pokerView.fxml"));
			PokerScreen = (BorderPane) loader.load();
			Scene scene = new Scene(PokerScreen);
			primaryStage.setScene(scene);
			PC = loader.getController();
			PC.setMainApp(this);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	
	
	
	
	
	
}
