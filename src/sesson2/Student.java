package sesson2;

public abstract class Student { // tạo lớp trừu tượng
    public String name;
    public int year;
    public String studentCode; // khai báo các thuộc tính lớp student

    // khai báo phương thức trừu tượng
    public abstract void showInfo(); // phương thức trừu tượng không có nội dung
    public abstract void running();
    public abstract void sleep();
}
