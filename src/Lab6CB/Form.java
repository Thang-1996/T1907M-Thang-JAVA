package Lab6CB;

import Sesson6.ProductDataAcessObject;
import Sesson8.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Form {
    public TextField txtName = new TextField();
    public TextArea txtDesc = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();
    private Load ld = Load.getInstance();
    public void submit(){
        try{

            String name = txtName.getText();
            String desc = txtDesc.getText();
            int price = Integer.parseInt(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());
//            Connector connector = Connector.getInstance();
//            String sql_text = "INSERT INTO products(name,des,price,amount) VALUES('"+name+"','"+desc+"',"+price+","+amount+")"; // thay ? bằng hàng cụ thể và sẽ không tạo statement
//            // sẽ dùng lớp preparedStament
//            Boolean prstm = connector.excuteUpdate(sql_text);  // truyền vào câu và sẽ không cần phải viết đúng chuỗi tên hàng truyền vào
//            prstm.setString(1,name); // 1 là giá trị dấu ? đầu tiên và sau là giá trị truyền vào
//            prstm.setString(2,desc);
//            prstm.setInt(3,price);
//            prstm.setInt(4,amount);
           // hàm prepared sẽ trả về biến boolean false or true
//
            ProductDataAcessObject pdao = ProductDataAcessObject.getInstance();
            Product pd = new Product(name,desc,price,amount);
            if(pdao.create(pd)){
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }else{
                System.out.println("Fail");
            }
//            Parent ls = ld.loadScene("list.fxml");
//            Main.mainStage.getScene().setRoot(ls);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
