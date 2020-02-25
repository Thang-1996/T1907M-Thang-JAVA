package Assigment3;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> personModel = new PersonModel<Student>();
        personModel.addStudent(new Student(1,"thang",18));
        personModel.addStudent(new Student(2,"huyen",18));
        PersonModel<Employee> personModel1 = new PersonModel<Employee>();
        personModel1.addEmp(new Employee(1,"thang",20000));
        personModel1.addEmp(new Employee(2,"huyen",3000000));
        personModel.showStudent();
        personModel1.showEmp();
    }
}
