package view;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;



public class AbrirTela {
       public void abrirTela(ActionEvent evento, String arquivo, String css) throws IOException {
        Parent root;
        Stage tela;
        Scene cena;
        // Coloca arquivo na memória para carregar
        root = FXMLLoader.load(getClass().getResource(arquivo));
        // Cria cena a partir do arquivo
        cena = new Scene(root);
        cena.getStylesheets().addAll(getClass().getResource(css).toString());
        // Define que a tela que será usada será a mesma da aplicação
        tela = (Stage)((Node)evento.getSource()).getScene().getWindow();
        // Define nova cena para a 3tela
        tela.setScene(cena);
        // Mostra a tela
        tela.show();
   }
}
