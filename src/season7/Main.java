package season7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) { // primaryStage là khung ứng dụng nếu muốn dùng chung khung cho 1 ứng dụng thì sẽ khai báo 1 biến static public để gọi được tất cả mọi nơi
        // thường đặt trong trycatch
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            primaryStage.setTitle("Student");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
