package Assigment6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import org.w3c.dom.ls.LSOutput;
import Assigment6.Product;
import javafx.scene.control.MultipleSelectionModel;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class pdlist implements Initializable {

    public ListView<Product> lsview = new ListView<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/productmanager"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connect Success!");
            String sql_text = "SELECT * FROM products";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);
            // lấy toàn bộ thông tin database vào 1 arraylist observable list
            ObservableList ls = FXCollections.observableArrayList(); // fx collection
            while (rs.next()) {
                Product pd = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("des"),rs.getInt("price"),rs.getInt("amount"));
                ls.addAll(pd);
            }
            lsview.setItems(ls);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void addcart() throws Exception{
        try{
                    Product selectedItem = lsview.getSelectionModel().getSelectedItem();
                    int id = selectedItem.id;
                    String name = selectedItem.name;
                    String des = selectedItem.des;
                    int price = selectedItem.price;
                    int amount = selectedItem.amount;
                    int total = selectedItem.price * selectedItem.amount;
                    CartManager cm = new CartManager(id,name,des,price,amount,total);
                    Main.ls2.addAll(cm);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void showcart(){
        try {
                Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
                Main.mainStage.getScene().setRoot(cart);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void submitform(){
        // lúc ấn vào button sẽ chuyển giao diện sang form này
        try {
            Parent form = FXMLLoader.load(getClass().getResource("addproduct.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
