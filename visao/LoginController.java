package visao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable{

    //static String dataBase = "https://na-bibliotecas-default-rtdb.firebaseio.com/";
    @FXML
    private TextField campoUsuario;

    @FXML
    private TextField campoSenha;

    @FXML
    private Button botaoEntrar;

    @FXML
    private Button botaoCadastrar;

    @FXML
    private AnchorPane loginContainer;

    @FXML
    public void fazerCadastro(ActionEvent event) throws IOException{
        FXMLLoader cadastroLoader = new FXMLLoader(getClass().getResource("/login/layout.fxml"));
        Parent cadastro = cadastroLoader.load();
        loginContainer.getChildren().setAll(cadastro);
    } 

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if(usuario.equals("Manel") && senha.equals("123")) {
            System.out.println("Login sucedido");
        } else {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Alerta de login");
            alerta.setHeaderText(null);
            alerta.setContentText("email ou senha inválido, repita a operação ou cadastre uma nova conta.");
            alerta.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
