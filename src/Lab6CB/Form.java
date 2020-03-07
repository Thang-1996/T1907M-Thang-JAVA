package Lab6CB;

import Sesson8.Connector;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Form {
    public TextField txtName = new TextField();
    public TextArea txtDesc = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();
    public Load ld = Load.getInstance();
    public void submit(){
        try{
            String name = txtName.getText();
            String desc = txtDesc.getText();
            int price = Integer.parseInt(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());
            Connector connector = Connector.getInstance();
            String sql_text = "INSERT INTO products(name,des,price,amount) VALUES('"+name+"','"+desc+"',"+price+","+amount+")"; // thay ? bằng hàng cụ thể và sẽ không tạo statement
            // sẽ dùng lớp preparedStament
            Boolean prstm = connector.excuteUpdate(sql_text);  // truyền vào câu và sẽ không cần phải viết đúng chuỗi tên hàng truyền vào
//            prstm.setString(1,name); // 1 là giá trị dấu ? đầu tiên và sau là giá trị truyền vào
//            prstm.setString(2,desc);
//            prstm.setInt(3,price);
//            prstm.setInt(4,amount);
           // hàm prepared sẽ trả về biến boolean false or true
//                Parent list = FXMLLoader.load(getClass().getClassLoader().getResource("list.fxml"));
//                Main.mainStage.getScene().setRoot(list);
            Parent ls = ld.loadScene("list.fxml");
            Main.mainStage.getScene().setRoot(ls);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
