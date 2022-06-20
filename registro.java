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
        funcoes.abrirTela(event, "Estante.fxml", "app.css");
    }

    @FXML
    void abririnicio01(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Inicio.fxml", "app.css");
    }

    @FXML
    void abrirpedidos04(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Pedidos.fxml", "app.css");
    }

}
