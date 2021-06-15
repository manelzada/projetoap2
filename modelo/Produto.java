package modelo;

public abstract class Produto  {
    protected String autor;
    protected String titulo; 
    protected int numPaginas;
    protected int anoDePublicacao;


    public Produto() {
    }

    public Produto(String autor, String titulo, int numPaginas, int anoDePublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.anoDePublicacao = anoDePublicacao;
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

    public int getNumDePaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if(numPaginas<0)
            this.numPaginas = 0;
        else    
            this.numPaginas = numPaginas;
    }

    public int getAnoDePublicacao() {
        return this.anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

}
