package login;


import java.io.IOException;

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
    void cadastroFeito(ActionEvent event) throws IOException{
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Alerta de Cadastro");
        alerta.setHeaderText(null);
        alerta.setContentText("Cadastro Efetuado com Sucesso!");
        alerta.showAndWait();
        // ---
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/visao/layout.fxml"));
        Parent login = loginLoader.load();
        cadastroContainer.getChildren().setAll(login);
    }

}
