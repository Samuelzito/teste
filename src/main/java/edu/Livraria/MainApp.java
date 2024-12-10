package edu.Livraria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            System.out.println("Tentando carregar o arquivo FXML...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MenuView.fxml"));
            if (loader.getLocation() == null) {
                System.err.println("Arquivo FXML não encontrado no caminho especificado!");
            }
            Scene scene = new Scene(loader.load());
            primaryStage.setTitle("Menu Principal");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            System.err.println("Erro ao carregar o arquivo FXML:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
