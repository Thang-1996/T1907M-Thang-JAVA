package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human(10);
        h.getinFor();
        System.out.println("Tuoi"+h.age);
        Car c = new Car();
        System.out.println("Year"+c.year);
    }
}
