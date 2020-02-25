package com.company;

public class Human {
    protected int age = 10;
    public Human(){ // ham khoi tao
        System.out.println("Vua tao 1 object human"); // tu dong chay ngay khi vua khoi tao doi tuong
    }
    public Human(String msg){ //  bien trong ngoac la de truyen vao doi tuong o ham main
        System.out.println(msg);
    }
    public Human(int x){
        age = x ;
        System.out.println("Vua set age = x");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getinFor(){
        System.out.println("Age"+age);
    }
}
