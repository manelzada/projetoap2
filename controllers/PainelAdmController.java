package controllers;

import controle.ControleProduto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PainelAdmController {

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

}
