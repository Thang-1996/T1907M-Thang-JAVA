package Assigment3;

import java.util.ArrayList;

public class PersonModel<S> {
   ArrayList<Student> person = new ArrayList<>();
   ArrayList<Employee> person1 = new ArrayList<>();
   public void addStudent(Student student){
       person.add(new Student(student.iD,student.name,student.age));
   }
   public void showStudent(){
       System.out.println("Student List: ");
       for(Student s : person){
           System.out.println(s.toString());
       }
   }
    public void addEmp(Employee employee){
        person1.add(new Employee(employee.iD,employee.name,employee.salary));
    }
    public void showEmp(){
        System.out.println("Emp List: ");
        for(Employee e : person1){
            System.out.println(e.toString());
        }
    }
}
