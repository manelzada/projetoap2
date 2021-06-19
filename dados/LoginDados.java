package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import login.Login;

public class LoginDados implements Serializable {

    public void cadastrarLogin(Login objLogin) {

        ArrayList<Login> listLogin = new ArrayList<>();
        try {
            listLogin = listarLogin();
        } catch (FileNotFoundException e) {
            File arquivo = new File("dados/user.ser");
            try {
                arquivo.createNewFile();
            } catch (IOException x) {
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        try {
            listLogin.add(objLogin);

            File endereco = new File("dados/user.ser");
            FileOutputStream fluxo = new FileOutputStream(endereco);
            ObjectOutputStream oos = new ObjectOutputStream(fluxo);
            System.out.println("parte 2");
            oos.writeObject(listLogin);
            oos.flush();
            fluxo.flush();
            oos.close();
            fluxo.close();
            System.out.println("parte 3");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Login> listarLogin() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Login> listLogin;
        File endereco = new File("dados/user.ser");
        FileInputStream fluxo = new FileInputStream(endereco);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        listLogin = (ArrayList<Login>) lerObj.readObject();
        return listLogin;
    }   
}