package controle;

import java.io.Serializable;
import java.util.ArrayList;

import dados.CadastraProdutos;
import modelo.*;

public class ControleProduto implements Serializable {

    private ArrayList<Livro> livros;
    private ArrayList<ArtigoCientif> Artigos;
    CadastraProdutos cadProduto = new CadastraProdutos();

    public void cadastrarLivro(double valorCompra, String autor, String titulo, int numPaginas,
            String anoDePublicacao) {
        Livro livro = new Livro(valorCompra, autor, titulo, numPaginas, anoDePublicacao);
        // System.out.print(livro.toString());
        cadProduto.cadastrarProduto(livro);
    }

    public ArrayList<Livro> listarLivro() throws NullPointerException {
        Livro livro = new Livro();
        return livro.listarLivro();
    }

    public void removeLivro(double valorCompra, String autor, String titulo, int numPaginas, String anoDePublicacao) {
        Livro livro = new Livro(valorCompra, autor, titulo, numPaginas, anoDePublicacao);
        livros.remove(livro);
    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public void cadastrarArtigoCientif(ArtigoCientif Artigo) throws NullPointerException {
        if (Artigo == null) {
            throw new NullPointerException("Erro de objeto Artigo Cientifico null");
        } else {
            Artigos.add(Artigo);
        }
    }

    public ArrayList<ArtigoCientif> listarArtigoCientif() throws NullPointerException {
        ArtigoCientif Artigo = new ArtigoCientif();
        return Artigo.listarArtigoCientif();
    }

    public Produto pesquisaArtigoCientiftitulo(String titulo) {
        for (int i = 0; i < Artigos.size(); i++) {
            if (Artigos.get(i).getTitulo() == titulo) {
                return Artigos.get(i);
            }
        }
        return null;
    }

    public Produto pesquisaArtigoCientifautor(String autor) {
        for (int i = 0; i < Artigos.size(); i++) {
            if (Artigos.get(i).getAutor() == autor) {
                return Artigos.get(i);
            }
        }
        return null;
    }

    public void removeArtigoCientif(String Universidade, String orientador, String autor, String titulo, int numPaginas,
            String anoDePublicacao) {
        ArtigoCientif Artigo = new ArtigoCientif(Universidade, orientador, autor, titulo, numPaginas, anoDePublicacao);
        Artigos.remove(Artigo);
    }

}
