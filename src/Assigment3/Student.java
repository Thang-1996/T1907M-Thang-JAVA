package Assigment3;

public class Student {
    public int iD;
    public String name;
    public int age;

    public Student() {
    }

    public Student(int iD, String name, int age) {
        this.iD = iD;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
