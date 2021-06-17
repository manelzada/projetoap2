package controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import controle.ControleUsuario;
import dados.LoginDados;
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
import login.Login;

public class LoginController implements Initializable {
    Login login = new Login();
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
    public void fazerCadastro(ActionEvent event) throws IOException {
        FXMLLoader cadastroLoader = new FXMLLoader(getClass().getResource("/login/layout.fxml"));
        Parent cadastro = cadastroLoader.load();
        loginContainer.getChildren().setAll(cadastro);
    }

    @FXML
    void fazerLogin(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {
        ControleUsuario cUser = new ControleUsuario();
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        boolean verificaLogin = cUser.loginUsuario(usuario, senha);
        if (verificaLogin == true) {
           System.out.print("Deu bom");
        } else {
            System.out.print("Deu ruim");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}