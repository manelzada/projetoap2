package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Livro extends Produto implements Serializable{
    private double valorCompra;

    public Livro() {
    }

    public Livro(double valorCompra, String autor, String titulo, int numPaginas, String anoDePublicacao) {
        super(autor, titulo, numPaginas, anoDePublicacao);
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return this.valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        if (valorCompra < 0)
            this.valorCompra = 0;
        else
            this.valorCompra = valorCompra;
    }

    public ArrayList<Livro> listarLivro() throws NullPointerException {
        Livro liv = new Livro();
        ArrayList<Livro> livr = liv.listarLivro();
        return livr;
    }

}
