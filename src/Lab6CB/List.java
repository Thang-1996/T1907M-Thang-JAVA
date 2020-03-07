package Lab6CB;

import Sesson8.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;


import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
public class List implements Initializable {
    public ListView<Product> lsview = new ListView();
    ObservableList ls = FXCollections.observableArrayList();
    Load ld = Load.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            // gọi lại class connector để thực thi
            String sql_txt = "SELECT * FROM products";
            Connector connector = Connector.getInstance(); // truy vấn sẽ tạo đối tượng
            ResultSet rs = connector.getQuery(sql_txt);
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
//            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
//            Main.mainStage.getScene().setRoot(form);
            Parent load = ld.loadScene("form.fxml");
            Main.mainStage.getScene().setRoot(load);

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
//
//            Parent cart = FXMLLoader.load(getClass().getClassLoader().getResource("cart.fxml"));
//            Main.mainStage.getScene().setRoot(cart);
            Parent cart = ld.loadScene("cart.fxml");
            Main.mainStage.getScene().setRoot(cart);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
