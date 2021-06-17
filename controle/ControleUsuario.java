package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import dados.LoginDados;
import login.*;

public class ControleUsuario {
    private ArrayList<Login> login = new ArrayList<>();
    public void cadastrarUsuario(String email, String senha, String numero){
        Login log = new Login(email, senha, numero);
        log.cadastrarLogin(log);
        login.add(new Login(email, senha, numero));
    }

    public ArrayList<Login> listarUsuario() throws FileNotFoundException, IOException, ClassNotFoundException{
        LoginDados logDados = new LoginDados();
        ArrayList<Login>  listar = logDados.listarLogin();
        return listar;
    }

    public Login pesquisarLogin(String email) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Login> listLogin = listarUsuario();
        for (Login g : listLogin) {
            if (email.equals(g.getEmail())) {
                System.out.print(g.getEmail() + g.getSenha());
                return g;
            }
        }
        return null;
    }
    public boolean loginUsuario(String email, String senha) throws FileNotFoundException, IOException, ClassNotFoundException{
        Login login = pesquisarLogin(email);
        if(login.getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}
