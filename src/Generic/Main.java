package Generic;

public class Main {
    public static void main(String[] args) {
        Generic g = new Generic();
        g.showMessage("Good Morning"); // kiểu string vào e
        g.showMessage(18); //  sẽ là kiểu interger
        // khi dùng lại lớp tham số hóa bên hàm main thì phải báo rõ ra lớp tham số hóa đó là kiểu dữ liệu gì
        Generic<String,Integer> g2 = new Generic<String, Integer>();
        // khai báo để chắc chắn các biến K,V thuộc kiểu dữ liệu nào
        g2.setName("thang"); // chỉ được truyền String
        g2.setPhone(8888888);//chỉ được truyền interger
        g.getName();
    }
}
