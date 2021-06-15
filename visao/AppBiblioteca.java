package visao;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppBiblioteca extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Biblioteca");
        Button entrar = new Button("Entrar");
        entrar.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Clicou no botão");
                
            }
            
        });
        StackPane root = new StackPane();
        root.getChildren().addAll(entrar);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    
}
