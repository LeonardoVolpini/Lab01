package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempi;

    @FXML
    private Button btnCancella;

    @FXML
    private Button btnReset;

    @FXML
    void doCancella(ActionEvent event) {
    	this.elenco.cancellaParola(this.txtResult.getSelectedText());
    	String ris="";
    	for (String s : elenco.getElenco())
    		ris= ris + s + "\n";
    	this.txtResult.setText(ris);
    }

    @FXML
    void doInsert(ActionEvent event) {
    	if (this.txtParola.getText().isEmpty()) {
    		return;
    	}
    	elenco.addParola(this.txtParola.getText());
    	String ris="";
    	for (String s : elenco.getElenco())
    		ris= ris + s + "\n";
    	this.txtResult.setText(ris);
    	this.txtParola.setText("");
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	this.txtParola.setText("");
    	this.txtResult.setText("");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempi != null : "fx:id=\"txtTempi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}

