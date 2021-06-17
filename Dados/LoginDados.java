package Dados;
import modelo.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java .util.ArrayList;

import login.Login;


public class LoginDados {
    
    public void cadastrarLogin(Login l)throws FileNotFoundException,IOException{
        FileOutputStream cadl = new FileOutputStream("cadastro.txt", true);
        try (ObjectOutputStream gravarObjeto = new ObjectOutputStream(cadl)){
            gravarObjeto.writeObject(l);
        }
        
    }

    public ArrayList<Login> listarLogin() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList <Login> listl = new ArrayList();
        FileInputStream cadl = new FileInputStream("cadastro.ser");
        ObjectInputStream lerObj = null;
        try{

            while (cadl.available()>0){
                lerObj = new ObjectInputStream(cadl);
                Login l = (Login) lerObj.readObject();

                listl.add(l);
            }
            
            cadl.close();
            lerObj.close();

        }catch(EOFException e){
            System.out.println("Fim do arquivo");
        }
        return listl;
    }
    }


