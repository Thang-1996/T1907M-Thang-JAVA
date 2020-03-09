package Assigment5;

import Lab6CB.Product;
import Sesson6.ProductDataAcessObject;
import Sesson8.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDataObject implements DataAcessObjectConCreate<Student> {
    private static StudentDataObject instance;
    private StudentDataObject(){

    }
    public static StudentDataObject getInstance(){
        if(instance == null){
            instance = new StudentDataObject();
        }
        return instance;
    }
    @Override
    public ArrayList<Student> list() {
        try{
            Connector conn = Connector.getInstance() ;
            ResultSet rs = conn.getQuery("SELECT * FROM students");
            ArrayList<Student> ls = new ArrayList<>();
            while(rs.next()){
                ls.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getInt("mark")));
            }
            return ls;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Boolean create(Student student) {
        try{
            Connector conn = Connector.getInstance();
            Boolean stm = conn.excuteUpdate("INSERT INTO students(name,age,mark) VALUES('"+student.getName()+"',"+student.getAge()+","+student.getMark()+")");
            return stm;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean update(Student student) {
        try{
            Connector conn = Connector.getInstance();
            Boolean stm = conn.excuteUpdate("UPDATE students SET name = "+student.getName()+"Age ="+student.getAge()+"Mark = "+student.getMark()+"WHERE id = "+student.getId());
            return stm;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean delete(Student student) {
        try{
            Connector conn = Connector.getInstance();
            Boolean stm = conn.excuteUpdate("DELETE FROM students WHERE id="+student.getId());
            return stm;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
