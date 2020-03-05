package Assigment6;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Form {
    public TextField pd_name = new TextField();
    public TextField pd_des = new TextField();
    public TextField pd_price = new TextField();
    public TextField pd_amount = new TextField();

    public void addProduct() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/productmanager"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connect Success!");
            String name = pd_name.getText();
            String des = pd_des.getText();
            Integer price = Integer.parseInt(pd_price.getText());
            Integer amount = Integer.parseInt(pd_amount.getText());
            String sql_text = "INSERT INTO products(name,des,price,amount) VALUES('"+name+"','"+des+"',"+price+","+amount+")";
            Statement stm = conn.createStatement();
            // excuteUpdate sẽ trả về số lượng hàng ảnh hưởng

            int row_number = stm.executeUpdate(sql_text);
            if(row_number>0){
                Parent list = FXMLLoader.load(getClass().getResource("productList.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }else{
                // thông báo validation
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
