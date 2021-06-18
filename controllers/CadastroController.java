package controllers;

import java.io.IOException;

import controle.ControleUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class CadastroController {

    @FXML
    private AnchorPane cadastroContainer;

    @FXML
    private TextField cadastroEmail;

    @FXML
    private TextField cadastroSenha;

    @FXML
    private Button botaoCadastro;

    @FXML
    private TextField cadastroNumero;

    @FXML
    void cadastroFeito(ActionEvent event) throws IOException {
        String userEmail = cadastroEmail.getText();
        String userSenha = cadastroSenha.getText();
        String userNumero = cadastroNumero.getText();
        if ((userEmail.isEmpty()) || (userSenha.isEmpty()) || (userNumero.isEmpty())) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Alerta de Cadastro");
            alerta.setHeaderText(null);
            alerta.setContentText("Você deixou algum(s) campo(s) em branco, repita a operação");
            alerta.showAndWait();
        } else {
            ControleUsuario cUser = new ControleUsuario();
            cUser.cadastrarUsuario(userEmail, userSenha, userNumero);

            // Troca de telas
            FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/visao/layout.fxml"));
            Parent login = loginLoader.load();
            cadastroContainer.getChildren().setAll(login);
        }
    }

}
/*
 * cadastrarLogin(new Login(userEmail, userSenha, userNumero))
 */