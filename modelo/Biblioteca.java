package modelo;

import java.util.ArrayList;

public class Biblioteca {
    
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<ArtigoCientif> Artigos;


    public Biblioteca() {
    }


    public Biblioteca(String nome, ArrayList<Livro> livros, ArrayList<ArtigoCientif> Artigos) {
        this.nome = nome;
        this.livros = livros;
        this.Artigos = Artigos;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getlivros() {
        return this.livros;
    }

    public void setlivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<ArtigoCientif> getArtigos() {
        return this.Artigos;
    }

    public void setArtigos(ArrayList<ArtigoCientif> Artigos) {
        this.Artigos = Artigos;
    }

    
}
