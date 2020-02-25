package com.company;

public class Car {
    protected int year; // ra ngoai package dung duoc co the ke thua duoc
    //String typeCar = "Autocar";// bien default khong the dung duoc ngoai pham vi cua package chi dung duoc trong cung 1 package
    protected String typeCar = "Autocar";
    protected String brand = "toyata" ; // chi dung duoc trong pham vi class
    public Car (){

    }
    public void getInfo(){
        System.out.println("Brand "+brand);
    }

    public Car(int year, String typeCar, String brand) {
        this.year = year;
        this.typeCar = typeCar;
        this.brand = brand;
    }

    public Car(int year) {
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
