package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MenuController implements Initializable {

    @FXML
    private Button btnCarrinho;

    @FXML
    private Button btnSolicitarEmprestimo;

    @FXML
    private Pane paneCadastroConteinerMini;

    @FXML
    private Button btnCatalogoLivro;

    @FXML
    private AnchorPane cadastroContainer;

    @FXML
    private Button btnBuscarArtigo;

    @FXML
    private Button btnSobre;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblStatusMini;

    @FXML
    private Button btnSair;

    @FXML
    private AnchorPane anchorTela;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleClicks(ActionEvent event) throws Exception {
        if (event.getSource() == btnCatalogoLivro) {
            carregarTela("/visao/catalogoDeLivros.fxml");
        }

        else if (event.getSource() == btnBuscarArtigo) {
            carregarTela("/visao/buscaArtigo.fxml");
        }

        else if (event.getSource() == btnSolicitarEmprestimo) {
            carregarTela("/visao/solicitarEmprestimo.fxml");
        }

        else if (event.getSource() == btnCarrinho) {
            carregarTela("/visao/carrinho.fxml");
        }

        else if (event.getSource() == btnSobre) {
            carregarTela("/visao/sobre.fxml");

        }

        else if (event.getSource() == btnSair) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/visao/layout.fxml"));
            Parent root = fxmlLoader.load();
            cadastroContainer.getChildren().setAll(root);
        }

    }

    public void carregarTela(String caminho) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(caminho));
        Parent parents = loader.load();
        anchorTela.getChildren().setAll(parents);

    }

}
