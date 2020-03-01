package Lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<Student> students = new ArrayList<>(); // khai báo để gọi được nhiều nơi khi nhập xong sẽ nạp vào arrayList

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{ // tạo parent
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));//load file
        primaryStage.setTitle("Nhap thong tin sinh vien"); // set nội dung
        primaryStage.setScene(new Scene(root,600,400));// set scene with + height
        primaryStage.show(); // show ra
    }
}
