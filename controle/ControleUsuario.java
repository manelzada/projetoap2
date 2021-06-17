package controle;

import java.util.ArrayList;

import login.*;

public class ControleUsuario {
    private ArrayList<Login> login = new ArrayList<>();
    public void cadastrarUsuario(String nome, String senha, String numero){
        login.add(new Login(nome, senha, numero));
    }
}
