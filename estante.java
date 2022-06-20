package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class estante {

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check10;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check5;

    @FXML
    private CheckBox check6;

    @FXML
    private CheckBox check7;

    @FXML
    private CheckBox check8;

    @FXML
    private CheckBox check9;

    @FXML
    private CheckBox ckeck4;


    @FXML
    private Button alugar2;
    
    @FXML
    private Button inicio2;

    @FXML
    private Button pedidos2;

    @FXML
    private TextField pesquisa;

    @FXML
    private Button registro2;
    
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

    @FXML
    void abrirregistro03(ActionEvent event) throws IOException {
        AbrirTela funcoes = new AbrirTela();
        funcoes.abrirTela(event, "Registro.fxml", "app.css");
    }

    @FXML
    void aluga2(ActionEvent event) {
        if(check1.isSelected()){
            check1.getText();  
            Alert alarme = new Alert(AlertType.INFORMATION); 
            alarme.setHeaderText("Alugado com sucesso");
            alarme.show();
        }
        @FXML 
        void aluga2(ActionEvent event) {
            if(check2.isSected()){
                check1.getText();
                Alert alarme = new Alert(AlertType.INFORMATION);
            alarme.setHeaderText("Alugado com sucesso");
            alarme.show();


}

}

