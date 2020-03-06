package Lab6CB;

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
    public ListView<Product> lsview = new ListView();
    ObservableList ls = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/productmanager"; // ở cuối là tên database
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            String sql_txt = "SELECT * FROM products";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_txt);
            while(rs.next()){
                Product pd = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("des"),rs.getInt("price"),rs.getInt("amount"));
                ls.addAll(pd);
            }
            lsview.setItems(ls);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void form(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void addToCart(){
        Product selected = lsview.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("Add to cart succesfully");
    }
    public void cart(){
        try {

            Parent cart = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.mainStage.getScene().setRoot(cart);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
