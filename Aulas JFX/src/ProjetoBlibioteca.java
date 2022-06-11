import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ProjetoBlibioteca implements Initializable{
    private ArrayList<String> turmas = new ArrayList<String>();
    private ArrayList<String> alunos = new ArrayList<String>();
    @FXML
    private TextField CampoNome;

    @FXML
    private Label CampoTurma;

    @FXML
    private Label TextoAluno;

    @FXML
    private Button btnEntrar;

    @FXML
    private ChoiceBox<String> selecaoTurma;

    @FXML
    void cadastrarUsuario(ActionEvent event) {
        if(CampoNome.getText().equals("")){
            alertaErro("O nome não pode ficar vazio.");
        } else if(consultarUsuario(CampoNome, selecaoTurma)) {
            alertaErro("O usuário já existe.");
        } else if(selecaoTurma.getValue() == null) {
            alertaErro("Nenhuma turma foi selecionado.");
        } else {
            alunos.add(CampoNome.getText());
            alunos.add(selecaoTurma.getValue());
            System.out.println(CampoNome.getText());
            System.out.println(alunos.toString());
            alertaInfo("Usuário cadastrado.");
        }
    }

    void alertaInfo(String texto) {
        Alert mensagem = new Alert(AlertType.INFORMATION);
        mensagem.setContentText(texto);
        mensagem.show();
    }

    void alertaErro(String texto) {
        Alert mensagem = new Alert(AlertType.ERROR);
        mensagem.setContentText(texto);
        mensagem.show();
    }

    public boolean consultarUsuario(TextField user, ChoiceBox<String> turma) {
        boolean retorno = false;
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).equals(user.getText()) && alunos.get(i + 1).equals(turma.getValue())) {
                retorno = true;
            }
        }
        return retorno;
    }

    public void preencherLista(){
        turmas.add("1º Guia");
        turmas.add("1º Enfermagem");
        turmas.add("1º Infor");
        turmas.add("2º Guia");
        turmas.add("2º Enfermagem");
        turmas.add("2º Infor");
        turmas.add("3º Guia");
        turmas.add("3º Enfermagem");
        turmas.add("3º Infor");
        selecaoTurma.getItems().clear();
        selecaoTurma.getItems().addAll(turmas);
        
    }
    
    @FXML
    public void linkarTela(ActionEvent event, String arquivo, String css) throws Exception{
        root = FXMLLoader.load(getClass().geResource(arquivo));
        cena = new scene(root);
        cena.getStylesheets()addAll(getClass().getResource(css).toString());
        
        tela = Stage((Node)evento.getResource()).getScene().getWindow;
        tela.setScene(cena);
        tela.show;
    }
    
    @FXML
    void abrirTela01(ActionEvent event) throws Exception{
        linkarTela(event, arquivo:"Tela01.fxml", css:"app.css");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        preencherLista();
    }

}
