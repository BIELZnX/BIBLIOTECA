package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class inicio implements Initializable {

    @FXML
    private Button alugar;

    @FXML
    private Button estante1;

    @FXML
    private Button pedidos1;

    @FXML
    private TextField pesquisa;

    @FXML
    private Button registro1;
    

    @FXML
    void abrirestante02(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Estante.fxml");
    }

    @FXML
    void abrirpedidos(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Pedidos.fxml");
    }

    @FXML
    void abrirregistro03(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Registro.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        
    }
    
}


   
