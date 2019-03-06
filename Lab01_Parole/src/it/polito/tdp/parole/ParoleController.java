package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco;

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
    private TextArea txtResult2;

    @FXML
    private Button btnCancella;

    @FXML
    private Button btnReset;

    @FXML
    void doCancella(ActionEvent event) {
    	long tempoInizio= System.nanoTime();
    	elenco.cancella(txtParola.getText());
    	String risultato=" ";
    	for(String p:elenco.getElenco()) {
    		risultato+=p+"\n";
    	}
    	txtResult.setText(risultato);
    	long tempoFine= System.nanoTime();
    	txtResult2.setText("il tempo di esecuzione è:"+(tempoFine-tempoInizio));
    }

    @FXML
    void doInsert(ActionEvent event) {
    	long tempoInizio= System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	String risultato=" ";
    	for(String p:elenco.getElenco()) {
    		risultato+=p+"\n";
    	}
    	txtResult.setText(risultato);
    	long tempoFine= System.nanoTime();
    	txtResult2.setText("il tempo di esecuzione è:"+(tempoFine-tempoInizio));
    }

    @FXML
    void doReset(ActionEvent event) {

    	txtParola.clear();
    	txtResult.clear();

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult2 != null : "fx:id=\"txtResult2\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Parole.fxml'.";
        
        elenco=new Parole();
    }
}