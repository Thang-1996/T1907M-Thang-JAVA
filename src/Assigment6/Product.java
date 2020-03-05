package Assigment6;
import Assigment6.pdlist.*;

public class Product {
    public int id;
    public String name;
    public String des;
    public int price;
    public int amount;

    public Product(int id, String name, String des, int price, int amount) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ID: "+id+" | "+"Tên Sản Phẩm:"+name+" | "+"Mô Tả:"+des+" | "+"Đơn Giá:"+price+" | "+"Số Lượng:"+amount;
    }
}
