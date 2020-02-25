package Assigment3;

public class Employee {
    public int iD;
    public String name;
    public double salary;

    public Employee() {
    }

    public Employee(int iD, String name, double salary) {
        this.iD = iD;
        this.name = name;
        this.salary = salary;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
