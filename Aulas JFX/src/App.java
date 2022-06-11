import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage tela) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("View/ProjetoBiblioteca.fxml"));
        Scene cena = new Scene(root);
        tela.setScene(cena);
        tela.show(); 
    }

}
