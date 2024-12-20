package app.inicio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HolaMundoController extends AppController{

	@FXML
    private Button bttEntrar;

    @FXML
    private Label lbAlgo;

    @FXML
    private TextField tfAlgo;

    @FXML
    void entrar(ActionEvent event) {
    	changeScene(FXML_BIENVENIDA);
    	addParam("texto", tfAlgo.getText());
    }
    
    @FXML
    public void imprimir(ActionEvent event) {
    	System.out.println(tfAlgo.getText());
    	lbAlgo.setText(tfAlgo.getText());
    }

}
