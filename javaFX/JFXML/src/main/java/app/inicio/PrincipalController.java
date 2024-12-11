package app.inicio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class PrincipalController extends AppController {

		@FXML
		private BorderPane panel;

	    @FXML
	    void abrirPantalla1(ActionEvent event) {
	    	panel.setCenter(loadScene(FXML_HOLA_MUNDO));
	    }

	    @FXML
	    void abrirPantalla2(ActionEvent event) {
	    	panel.setCenter(loadScene(FXML_BIENVENIDA));
	    }

	}

	

