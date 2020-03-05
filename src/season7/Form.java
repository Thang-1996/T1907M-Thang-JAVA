package season7;

import Lab1.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import java.sql.*;

public class Form { // lớp xử lý hành động
    // gọi các textfield theo id vào
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    // function để truyền giá trị nhập từ textfield vào mảng arraylist
    public void submitStudent() throws Exception {
        //gắn tên hàm vào button và gọi ra onAction để thực hiện submit
         // nhập vào textfield khi lấy ra sẽ là text String
        // chuyển kiểu dữ liệu

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1907m"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            String name = txtName.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());
            String sql_text = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")";
            Statement stm = conn.createStatement();
            // excuteUpdate sẽ trả về số lượng hàng ảnh hưởng

            int row_number = stm.executeUpdate(sql_text);
                       if(row_number>0){
                           // sẽ chuyển về màn hình danh sách
                           Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                           Main.mainStage.getScene().setRoot(list); // set Secene và setroot chuyển về giao diện list
                       }else{
                           // thông báo validation
                       }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
