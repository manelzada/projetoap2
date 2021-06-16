package visao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import login.*;
import Controle.*;

public class AppBiblioteca extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginController cleitonrasta;
        //String diretorio = 
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);
        primaryStage.setTitle("NA Bibliotecas");
        primaryStage.setScene(tela);
        primaryStage.show();
        }
    
}