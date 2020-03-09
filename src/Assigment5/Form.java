package Assigment5;

import Sesson8.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;

public class Form{
    // tạo table view + column
    public TableView<Student> table;
    public TableColumn<Student,Integer> table_id;
    public TableColumn<Student,String> table_name;
    public TableColumn<Student,Integer> table_age;
    public TableColumn<Student,Integer> table_mark;
    // tạo textfield
    public  TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public  TextField txtMark = new TextField();
    // tạo list lưu giữ liệu lấy từ database
    ObservableList<Student> oblist = FXCollections.observableArrayList();

    public void submit(){
        // lấy thông tin nhập vào từ textfield
        String name = txtName.getText();
        Integer age;
        Integer mark;
        age = Integer.parseInt(txtAge.getText());
        mark = Integer.parseInt(txtMark.getText());
        try{
            StudentDataObject stdao = StudentDataObject.getInstance();
            Student pd = new Student(name,age,mark);
            stdao.create(pd);
            ArrayList<Student> ls = stdao.list();
            oblist.removeAll();
            oblist.addAll(ls);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        // set cell value
        table_id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
        table_name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        table_age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));
        table_mark.setCellValueFactory(new PropertyValueFactory<Student,Integer>("mark"));
        table.setItems(oblist);
    }
}
