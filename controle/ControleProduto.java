package controle;

import java.util.ArrayList;
import modelo.*;

public class ControleProduto {
    
    private ArrayList<Livro> livros;
    private ArrayList<ArtigoCientif> Artigos;


    public void cadastrarLivro(Livro livro) throws NullPointerException{
        if (livro == null){
            throw new NullPointerException("Erro de objeto Livro null");
        }
        else{
            livros.add(livro);
        }
    }


    public ArrayList<Livro> listarLivro() throws NullPointerException {
       Livro livro = new Livro();
        return livro.listarLivro();
    }


    public Livro pesquisarLivroCodigo(int codig){
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getCodigo() == codig){
                return livros.get(i);
            }
        }
        return null;
    }

    public Produto pesquisaLivroNome(String titulo) { 
        for(int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getTitulo() == titulo) {
                return livros.get(i);
            }
        }
        return null;
    }
    public void removeLivro(int codigo, String ISBN, double valorCompra, String autor, String titulo, int numPaginas, int anoDePublicacao) {
        Livro livro = new Livro(codigo,  ISBN,  valorCompra,  autor, titulo, numPaginas, anoDePublicacao);
        livros.remove(livro);
    }

     //////////////////////////////////////////////////////////////////////////////////////////

    public void cadastrarArtigoCientif(ArtigoCientif Artigo) throws NullPointerException{
        if (Artigo == null){
            throw new NullPointerException("Erro de objeto Artigo Cientifico null");
        }
        else{
            Artigos.add(Artigo);
        }
    }
    public ArrayList<ArtigoCientif> listarArtigoCientif() throws NullPointerException {
        ArtigoCientif Artigo = new ArtigoCientif();
         return Artigo.listarArtigoCientif();
     }
 

    
    public Produto pesquisaArtigoCientiftitulo(String titulo) { 
        for(int i = 0; i < Artigos.size(); i++) {
            if(Artigos.get(i).getTitulo() == titulo) {
                return Artigos.get(i);
            }
        }
        return null;
    }

    public Produto pesquisaArtigoCientifautor(String autor) { 
        for(int i = 0; i < Artigos.size(); i++) {
            if(Artigos.get(i).getAutor() == autor) {
                return Artigos.get(i);
            }
        }
        return null;
    }

    public void removeArtigoCientif(String Universidade, String orientador, String autor, String titulo, int numPaginas, int anoDePublicacao) {
        ArtigoCientif Artigo = new ArtigoCientif(Universidade,  orientador, autor,  titulo, numPaginas,  anoDePublicacao);
        Artigos.remove(Artigo);
    }



}
