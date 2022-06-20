package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class registro {

    @FXML
    private Button estante2;

    @FXML
    private Button inicio3;

    @FXML
    private Button pedidos3;

    @FXML
    void abrirestante02(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Estante.fxml");
    }

    @FXML
    void abririnicio01(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Inicio.fxml");
    }

    @FXML
    void abrirpedidos04(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Pedidos.fxml");
    }

}
