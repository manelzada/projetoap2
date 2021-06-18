package login;

import java.io.Serializable;

import dados.LoginDados;

public class Login implements Serializable {
    String email;
    String senha;
    String numero;
    int nivel;

    public Login() {
    }

    public Login(String email, String senha, String numero) {
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

    public void cadastrarLogin(Login l) {
        LoginDados log = new LoginDados();
        log.cadastrarLogin(l);
    }
}
