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
        
        root = FXMLLoader.load(getClass().getResource(arquivo));
        cena = new Scene(root);
        cena.getStylesheets().addAll(getClass().getResource(css).toString());
        
        tela = (Stage)((Node)evento.getSource()).getScene().getWindow();
        tela.setScene(cena);
        tela.show();
   }
}
