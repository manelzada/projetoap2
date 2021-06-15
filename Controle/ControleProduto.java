package Controle;

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

}
