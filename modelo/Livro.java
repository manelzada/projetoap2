package modelo;

import java.util.ArrayList;

public class Livro extends Produto {
    
    private int codigo;
    private String ISBN;
    private double valorCompra;


    public Livro() {
    }

    public Livro(int codigo, String ISBN, double valorCompra, String autor, String titulo, int numPaginas, int anoDePublicacao) {
        super(autor, titulo, numPaginas, anoDePublicacao);
        this.codigo = codigo;
        this.ISBN = ISBN;
        this.valorCompra = valorCompra;
    }
    


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getValorCompra() {
        return this.valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        if (valorCompra<0)
            this.valorCompra = 0;
        else
            this.valorCompra = valorCompra;
    } 

    public ArrayList<Livro> listarLivro() throws NullPointerException {
        Livro liv = new Livro();
        ArrayList <Livro> livr = liv.listarLivro();
        return livr;
    }

}
