package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import modelo.Livro;

public class CadastraProdutos implements Serializable {
    public void cadastrarProduto(Livro objLivro) {

        ArrayList<Livro> listLivro = new ArrayList<>();
        try {
            listLivro = listarLivro();
        } catch (FileNotFoundException e) {
            File arquivo = new File("dados/produtos.ser");
            try {
                arquivo.createNewFile();
            } catch (IOException x) {
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        try {
            listLivro.add(objLivro);

            File endereco = new File("dados/produtos.ser");
            FileOutputStream fluxo = new FileOutputStream(endereco);
            ObjectOutputStream oos = new ObjectOutputStream(fluxo);
            System.out.println("parte 2");
            oos.writeObject(listLivro);
            oos.flush();
            fluxo.flush();
            oos.close();
            fluxo.close();
            System.out.println("parte 3");

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public ArrayList<Livro> listarLivro() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Livro> listLivro;
        File endereco = new File("dados/produtos.ser");
        FileInputStream fluxo = new FileInputStream(endereco);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        listLivro = (ArrayList<Livro>) lerObj.readObject();
        return listLivro;
    }
}
