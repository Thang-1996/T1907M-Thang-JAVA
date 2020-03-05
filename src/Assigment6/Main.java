package Assigment6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static ObservableList ls2 = FXCollections.observableArrayList();
    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("productList.fxml"));
            primaryStage.setTitle("Product List");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
