package controllers;

import java.io.FileNotFoundException;
import java.io.IOException;

import dados.CadastraProdutos;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class CatalogoDeLivrosController {

    @FXML
    private ListView<String> listViewProdutos;

    @FXML
    void initialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        CadastraProdutos cProdutos = new CadastraProdutos();
        listViewProdutos.getItems().add(cProdutos.imprimirList());
    }

}