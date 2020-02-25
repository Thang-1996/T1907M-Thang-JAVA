package Assigment3;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> personModel = new PersonModel<>();
        personModel.addPerson(new Student(1,"thang",18));
        personModel.addPerson(new Student(2,"huyen",18));
        System.out.println("Student List");
        personModel.showPerson();
        PersonModel<Employee> personModel1 = new PersonModel<>();
        personModel1.addPerson(new Employee(1,"thang",20000));
        personModel1.addPerson(new Employee(2,"huyen",3000000));
        System.out.println("Employee List");
        personModel1.showPerson();

    }
}
