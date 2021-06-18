package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Livro;

public class CatalogoDeLivrosController implements Initializable {
    @FXML
    private TableView<Livro> tableViewLivro;

    @FXML
    private TableColumn<Livro, String> tableColumnLivroTitulo;

    @FXML
    private TableColumn<Livro, String> tableColumnLivroAutor;

    @FXML
    private TableColumn<Livro, String> tableColumnLivroAno;

    @FXML
    private TableColumn<Livro, String> tableColumnLivroISBN;

    private List<Livro> listLivros = new ArrayList<>();

    private ObservableList<Livro> observableListLivros;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
