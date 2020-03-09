package Lab6CB;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
        public static Stage mainStage;
        public static ObservableList<Product> cart = FXCollections.observableArrayList();
    public static void main(String[] args) {
        launch(args);
    }
    public static Parent listPage;
    public static Parent fromPage; // tạo đối tượng static private

    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;
        try{
            if(listPage == null){
                listPage = FXMLLoader.load(getClass().getResource("list.fxml"));
            }
//            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            primaryStage.setTitle("Quan ly San Pham");
            primaryStage.setScene(new Scene(listPage,600,400));
            primaryStage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
