package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

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
    private Button btnSair;

    @FXML
    private AnchorPane cadastroContainer;

    @FXML
    private Button btnBuscarArtigo;

    @FXML
    private Button btnSobre;


    private void handleClicks(ActionEvent event){
        if(event.getSource()==btnCatalogoLivro){
            paneCadastroConteinerMini.setText("Catalogo Livro");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb(red: 32 , green: , blue: ), CornerRadii.EMPTY, Insets.EMPTY)
        }

        else if(event.getSource()==btnBuscarArtigo){

        }

        else if(event.getSource()==btnSolicitarEmprestimo){

        }

        else if(event.getSource()==btnCarrinho){

        }

        else if(event.getSource()==btnSobre){

        }
        
        else if(event.getSource()==btnSair){

        }
    }




    @FXML
    void abrirCatalogo(ActionEvent event) {

    }

    @FXML
    void abrirCatalogoArtigo(ActionEvent event) {

    }

    @FXML
    void solicitarEmprestimo(ActionEvent event) {

    }

    @FXML
    void abrirSobre(ActionEvent event) {

    }

    @FXML
    void sairDoMenu(ActionEvent event) {

    }

    @FXML
    void addItemCarrinho(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

}
