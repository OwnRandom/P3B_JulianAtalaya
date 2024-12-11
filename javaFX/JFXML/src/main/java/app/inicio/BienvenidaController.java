package app.inicio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BienvenidaController extends AppController{

    @FXML
    private Button bttVolver;

    @FXML
    void volver(ActionEvent event) {
    	changeScene(FXML_HOLA_MUNDO);
    	System.out.println(getParam("texto"));
    }
    
    @FXML
    public void initialize() {
    	System.out.println("Inicianizanlo la pantalla de bienvenida...");
    }

}
