package Assigment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Form{
    // tạo table view + column
    public TableView<Student> table;
    public TableColumn<Student,Integer> table_id;
    public TableColumn<Student,String> table_name;
    public TableColumn<Student,Integer> table_age;
    public TableColumn<Student,Integer> table_mark;
    // tạo textfield
    public  TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public  TextField txtMark = new TextField();
    // tạo list lưu giữ liệu lấy từ database
    ObservableList<Student> oblist = FXCollections.observableArrayList();

    public void submit() throws Exception {
        // lấy thông tin nhập vào từ textfield
        String name = txtName.getText();
        Integer age;
        Integer mark;
        age = Integer.parseInt(txtAge.getText());
        mark = Integer.parseInt(txtMark.getText());
        try{
            // step : Lấy  Driver
            Class.forName("com.mysql.jdbc.Driver");
//            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/T1907M"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
//            // Step 4: kết nối với database
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Kết nối mySQL thành công!");
            // bước truy vấn dữ liệu trong database
            Statement stm2 = conn.createStatement(); // tạo statement để thực hiện truy vấn insert
            String sql_txt2 = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")"; // câu truy vấn insert values = các mục nhập từ textfield
            stm2.executeUpdate(sql_txt2); // thực hiện insert
            Statement stm = conn.createStatement(); // statement select
            String sql_text = "SELECT * FROM students";// viết câu truy vấn sql lấy danh sách
            ResultSet rs = stm.executeQuery(sql_text); // tạo biến result để execute câu sql vừa truy vấn
                oblist.removeAll(oblist); // reset lại List khi lấy về từ database mỗi khi nhấn button
            // sử dụng dữ liệu thông tin vừa lấy từ truy vấn ra
            while(rs.next()){
                // thêm vào list tạo ở trên
                oblist.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
            }
        }catch (Exception e){
            throw new Exception("Error");
        }
        // set cell value
        table_id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
        table_name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        table_age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));
        table_mark.setCellValueFactory(new PropertyValueFactory<Student,Integer>("mark"));
        table.setItems(oblist);
//        table.getItems().clear();
//        table.getItems().addAll(oblist);
    }
}
