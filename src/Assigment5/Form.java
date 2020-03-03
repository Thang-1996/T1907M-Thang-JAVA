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
    public TableView<Student> table;
    public TableColumn<Student,Integer> table_id;
    public TableColumn<Student,String> table_name;
    public TableColumn<Student,Integer> table_age;
    public TableColumn<Student,Integer> table_mark;
    public  TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public  TextField txtMark = new TextField();
    ObservableList<Student> oblist = FXCollections.observableArrayList();
//    public TextArea txtArea = new TextArea();

    public void submit() throws Exception{
        String name = txtName.getText();
        Integer age;
        Integer mark;
        age = Integer.parseInt(txtAge.getText());
        mark = Integer.parseInt(txtMark.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // lưu ý copy file driver vào nếu chưa có
            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/T1907M"; // ở cuối là tên database
            String username = "root";
            String password = ""; // nếu dùng xampp để chuỗi trống
            // Step 4: kết nối với database
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Kết nối mySQL thành công!");
            // bước truy vấn dữ liệu trong database
            Statement stm2 = conn.createStatement(); // tạo stament thứ 2 để truy vấn theo lượt
            String sql_txt2 = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")"; // try vấn insert
            stm2.executeUpdate(sql_txt2); // thực hiện insert
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM students";// viết câu truy vấn sql
            ResultSet rs = stm.executeQuery(sql_text); // tạo biến result để execute câu sql vừa truy vấn
            // sử dụng dữ liệu thông tin vừa lấy từ truy vấn ra
            while(rs.next()){
//                String line = "ID:" + rs.getInt("id") + "\tName:" + rs.getString("name") + "\tAge:" + rs.getInt("age") + "\tMark:" + rs.getInt("mark");
//                String str = "";
//                str += line+"\n";
//                txtArea.setText(str);
//                  txtArea.setText(line+"hahahahahah");
                oblist.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
                table_id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
                table_name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
                table_age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));
                table_mark.setCellValueFactory(new PropertyValueFactory<Student,Integer>("mark"));
                table.setItems(oblist);
            }
        }catch (Exception e){
            throw new Exception("Error");
        }
    }
}
