package login;
/*
Os niveis das contas serão definidas de 0 a 3 Sendo:
0 - Usuário normal(cliente): Terá acesso a biblioteca comum, comprar, alugar, ver pendencias, data de entregas, livros em posse...
1 - Moderador: Irá ter acesso a toda a lista de usuarios comuns, podendo emitir um alerta de devolução, ou definir uma multa para um
usuário e poderá adicionar mais itens ao catalogo.
2 - ADM: Acesso total ao fluxo de controle do app, tendo os mesmos direitos do moderador, mas, podendo criar, alterar, e exlcuir 
contas no sistema.
*/
public class Login {
    String id;
    String user; 
    String senha;
    String email;
    int nivel; 

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
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