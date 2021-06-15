package visao;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{

    static String dataBase = "https://na-bibliotecas-default-rtdb.firebaseio.com/";
    @FXML
    private TextField campoUsuario;

    @FXML
    private TextField campoSenha;

    @FXML
    private Button botaoEntrar;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if(usuario.equals("Manel") && senha.equals("123")) {
            System.out.println("Login sucedido");
        } else {
            System.out.println("Login Falhou");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
