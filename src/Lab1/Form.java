package Lab1;

import javafx.scene.control.TextField;

public class Form { // lớp xử lý hành động
    // gọi các textfield theo id vào
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    // function để truyền giá trị nhập từ textfield vào mảng arraylist
    public void submitStudent() throws Exception {
        //gắn tên hàm vào button và gọi ra onAction để thực hiện submit
        String name = txtName.getText();
//        String age = txtAge.getText();
//        String mark = txtAge.getText(); // nhập vào textfield khi lấy ra sẽ là text String
        // chuyển kiểu dữ liệu
        Integer age;
        Integer mark;
        try{
            age = Integer.parseInt(txtAge.getText());
            mark = Integer.parseInt(txtMark.getText());
            // cho chạy thử
        }catch(Exception e){
//            age = 18;
//            mark = 0; // giá trị mặc định
            // nếu sai sẽ thông báo lỗi để dừng chương trình
            //
            throw new Exception("Program Error!");
        }
        // add vào array ở main
        // tạo object Student
        Student s = new Student(name,age,mark);
        Main.students.add(s);
        Main.students.stream().forEach(e->{
            System.out.println(e.getName()+"-"+e.getAge()+"-"+e.getMark());
        });
    }
}
