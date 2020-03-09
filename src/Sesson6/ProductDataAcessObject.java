package Sesson6;

import Lab6CB.Main;
import Lab6CB.Product;
import Sesson8.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDataAcessObject implements DataAcessObjectConCreate<Product> {
    private static ProductDataAcessObject instance;
    // Singer Pattent
    private ProductDataAcessObject(){

    }
    public static ProductDataAcessObject getInstance(){
        if(instance == null){
            instance = new ProductDataAcessObject();
        }
        return instance;
    }
    @Override
    public ArrayList<Product> list() {
        try{
            Connector conn = Connector.getInstance() ;
            ResultSet rs = conn.getQuery("SELECT * FROM products");
            ArrayList<Product> ls = new ArrayList<>();
            while(rs.next()){
                ls.add(new Product(rs.getInt("id"),rs.getString("name"),rs.getString("des"),rs.getInt("price"),rs.getInt("amount")));
            }
            return ls;
        }catch(Exception e){

        }
        return null;
    }

    @Override
    public Boolean create(Product product) {
        try{
            Connector conn = Connector.getInstance();
            Boolean stm = conn.excuteUpdate("INSERT INTO products(name,des,price,amount) VALUES('"+product.getName()+"','"+product.getDes()+"',"+product.getPrice()+","+product.getAmount()+")");
            return stm;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean update(Product product) {
        try{
            Connector conn = Connector.getInstance();
            Boolean stm = conn.excuteUpdate("UPDATE products SET name = "+product.getName()+"description  ="+product.getDes()+"Price = "+product.getPrice()+"Amount ="+product.getAmount()+"WHERE id = "+product.getId());
            return stm;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean delete(Product product) {
        try{
            Connector conn = Connector.getInstance();
            Boolean stm = conn.excuteUpdate("DELETE FROM products WHERE id="+product.getId());
            return stm;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    } // implement lớp interface dataacess và truyền vào product object cần triển khai thay cho E
}
