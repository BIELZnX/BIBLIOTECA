package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class pedidos {

    @FXML
    private Button estante4;

    @FXML
    private Button inicio4;

    @FXML
    private Button registro4;

    @FXML
    void abrirestante02(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Estante.fxml", "app.css");
    }

    @FXML
    void abririnicio01(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Inicio.fxml", "app.css");
    }

    @FXML
    void abrirregistro03(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Registro.fxml", "app.css");
    }

}

