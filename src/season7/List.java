package season7;

import Assigment5.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class List implements Initializable {
    // tạo ra 1 listview để lưu trữ
    public ListView<Student> lsView = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // hàm khởi tạo để render ra giao diện khi load resource
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1907m"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            String sql_text = "SELECT * FROM students";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);
            // lấy toàn bộ thông tin database vào 1 arraylist observable list
            ObservableList ls = FXCollections.observableArrayList(); // fx collection
            while(rs.next()){
                Student st = new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark"));
                ls.addAll(st);
            }
            lsView.setItems(ls); // in items vào
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void form(){
        // lúc ấn vào button sẽ chuyển giao diện sang form này
        try {
            Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Main.mainStage.getScene().setRoot(form); // set Secene và root
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
