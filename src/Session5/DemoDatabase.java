package Session5;
// b1- thêm gói java package sql
import java.sql.*;
public class DemoDatabase {
    public static void main(String[] args) {
        // Step2 : khai báo driver bắt buộc ở trong try catch
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
            String name = "haha3";
            int age = 35;
            int mark = 36;
            Statement stm2 = conn.createStatement();
            String sql_txt2 = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")";
            Statement stm = conn.createStatement();
            stm2.executeUpdate(sql_txt2);
            String sql_text = "SELECT * FROM students";// viết câu truy vấn sql
            ResultSet rs = stm.executeQuery(sql_text); // tạo biến result để execute câu sql vừa truy vấn
            // sử dụng dữ liệu thông tin vừa lấy từ truy vấn ra
            while(rs.next()){
                // nếu là số int sẽ là dùng getInt chuỗi sẽ là dùng getString trong columnlable sẽ là tên cột trong database
                String line ="ID:" + rs.getInt("id") + "\tName:" + rs.getString("name") + "\tAge:" + rs.getInt("age") + "\tMark:" + rs.getInt("mark");
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
