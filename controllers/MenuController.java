package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
             
    }
    
    @FXML
    private void handleClicks(ActionEvent event){
        if(event.getSource()==btnCatalogoLivro)
        {
            lblStatusMini.setText("/home/catalogo Livro");
            lblStatus.setText("Catalogo Livro");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb( 32 , 0 , 0 ), CornerRadii.EMPTY, Insets.EMPTY)));
        }

        else if(event.getSource()==btnBuscarArtigo){
            lblStatusMini.setText("/home/buscar artigo");
            lblStatus.setText("Buscar artigo");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb(32 , 0 , 0 ), CornerRadii.EMPTY, Insets.EMPTY)));


        }

        else if(event.getSource()==btnSolicitarEmprestimo){
            lblStatusMini.setText("/home/solicitar emprestimo");
            lblStatus.setText("Solicitar emprestimo");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb(32 , 0 , 0  ), CornerRadii.EMPTY, Insets.EMPTY)));
        }

        else if(event.getSource()==btnCarrinho){
            lblStatusMini.setText("/home/carrinho");
            lblStatus.setText("Carrinho");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb(32 , 0 , 0  ), CornerRadii.EMPTY, Insets.EMPTY)));
        }

        else if(event.getSource()==btnSobre){
            lblStatusMini.setText("/home/sobre");
            lblStatus.setText("Sobre");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb(32 , 0 , 0  ), CornerRadii.EMPTY, Insets.EMPTY)));

        }
        
        else if(event.getSource()==btnSair){
            lblStatusMini.setText("/home/sair");
            lblStatus.setText("Sair");
            cadastroContainer.setBackground(new Background(new BackgroundFill(Color.rgb(32 , 0 , 0  ), CornerRadii.EMPTY, Insets.EMPTY)));

        }
        
    }


 

 

 public void handleClose(javafx.scene.input.MouseEvent event){

    if(event.getSource()==btnSair)
    System.exit(0);
 }


    

}
