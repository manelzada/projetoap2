package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Livro implements Serializable{
    private double valorCompra;
    String autor; 
    String titulo; 
    int numPaginas;
    String anoDePublicacao;

    public double getValorCompra() {
        return this.valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAnoDePublicacao() {
        return this.anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public Livro() {
    }

    public Livro(double valorCompra, String autor, String titulo, int numPaginas, String anoDePublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.valorCompra = valorCompra;
        this.anoDePublicacao = anoDePublicacao;
    }

    public ArrayList<Livro> listarLivro() throws NullPointerException {
        Livro liv = new Livro();
        ArrayList<Livro> livr = liv.listarLivro();
        return livr;
    }

}
