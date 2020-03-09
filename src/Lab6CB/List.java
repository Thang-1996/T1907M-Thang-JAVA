package Lab6CB;

import Sesson6.ProductDataAcessObject;
import Sesson8.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.sql.*;
public class List implements Initializable {
    public ListView<Product> lsview = new ListView();
    Load ld = Load.getInstance();
    public static ObservableList<Product> listData = FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            // gọi lại class connector để thực thi
            reloadData();
            lsview.setItems(listData);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void reloadData() throws Exception{ // tạo hàm reload data để load lại gữ liệu khi sử dụng
//        String sql_txt = "SELECT * FROM products";
//        Connector connector = Connector.getInstance(); // truy vấn sẽ tạo đối tượng
//        ResultSet rs = connector.getQuery(sql_txt);
//        ObservableList ls = FXCollections.observableArrayList();
//        while(rs.next()){
//            Product pd = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("des"),rs.getInt("price"),rs.getInt("amount"));
//            ls.addAll(pd);
//        }
        // sử dụng tiêp DAO Pattern sử dụng lại hàm viết ở product dataAccess
        ProductDataAcessObject pdao = ProductDataAcessObject.getInstance();
        ArrayList<Product> ls = pdao.list();
        listData.addAll(ls);
    }
    public void form(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
            Parent load = ld.loadScene("form.fxml");
            Main.mainStage.getScene().setRoot(load);
//            if(Main.fromPage == null){
//                Main.fromPage = FXMLLoader.load(getClass().getResource("form.fxml"));
//                Main.mainStage.getScene().setRoot(Main.fromPage);
//            }

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
