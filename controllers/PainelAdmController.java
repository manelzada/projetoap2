package controllers;

import java.io.IOException;

import controle.ControleProduto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PainelAdmController {

    @FXML
    private AnchorPane painelContainer;

    @FXML
    private Button backButton;

    @FXML
    private TextField campoAutor;

    @FXML
    private TextField campoTitulo;

    @FXML
    private TextField campoNumPg;

    @FXML
    private TextField campoPreco;

    @FXML
    private Button botaoCadastrar;

    @FXML
    private TextField campoAnoPubli;

    @FXML
    void fazerCadastroLivro(ActionEvent event) {
        String anoPubli = campoAnoPubli.getText();
        String autor = campoAutor.getText();
        String titulo = campoTitulo.getText();
        String numPgtemp = campoNumPg.getText();
        int numPg = Integer.parseInt(numPgtemp);
        String precoTemp = campoPreco.getText();
        double preco = Double.parseDouble(precoTemp); // Famosa gambiarra

        ControleProduto cProduto = new ControleProduto();
        cProduto.cadastrarLivro(preco, autor, titulo, numPg, anoPubli);

    }

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("/visao/layout.fxml"));
        Parent login = loginLoader.load();
        painelContainer.getChildren().setAll(login);
    }

}
