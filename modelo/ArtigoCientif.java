package modelo;

public class ArtigoCientif extends Produto {

    private String Universidade;
    private String orientador;   


    public ArtigoCientif() {
    }

    public ArtigoCientif(String Universidade, String orientador, String autor, String titulo, int numPaginas, int anoDePublicacao) {
        super(autor, titulo, numPaginas, anoDePublicacao);
        this.Universidade = Universidade;
        this.orientador = orientador;
    }

    public String getUniversidade() {
        return this.Universidade;
    }

    public void setUniversidade(String Universidade) {
        this.Universidade = Universidade;
    }

    public String getOrientador() {
        return this.orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    
}
