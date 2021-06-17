package dados;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import login.Login;

public class LoginDados {

    public static void cadastrarLogin(Login l) throws FileNotFoundException, IOException {
        File arquivo = new File("dados/user.ser");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        FileOutputStream cadl = new FileOutputStream("dados/user.ser", true);
        try (ObjectOutputStream gravarObjeto = new ObjectOutputStream(cadl)) {
            gravarObjeto.writeObject(l);
            gravarObjeto.flush();
        }
    }

    public static ArrayList<Login> listaLogin() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Login> listl = new ArrayList<>();
        FileInputStream cadl = new FileInputStream("dados/user.ser");
        ObjectInputStream lerObj = null;
        try {

            while (cadl.available() > 0) {
                lerObj = new ObjectInputStream(cadl);
                Login l = (Login) lerObj.readObject();

                listl.add(l);
            }

            cadl.close();
            lerObj.close();

        } catch (EOFException e) {
            System.out.println("Fim do arquivo");
        }
        return listl;
    }
    
    public static void verificaLogin() {
    } 
}
