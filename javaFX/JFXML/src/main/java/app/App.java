package app;

import app.inicio.AppController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		AppController controller = new AppController(primaryStage);
		//Iniciar escena
		FXMLLoader loader = new FXMLLoader(App.class.getResource("/app/inicio/holaMundo.fxml"));
		Scene scene = new Scene(loader.load());
		controller.changeScene(AppController.FXML_MENU);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Mi primer holamundo");
		primaryStage.show();
		
	
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
