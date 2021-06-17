package login;

import java.io.Serializable;

public class Login implements Serializable{
    String numero;
    String senha;
    String email;
    int nivel;

    public Login() {
    }

    public Login(String numero, String senha, String email) {
        this.email = email;
        this.senha = senha;
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
