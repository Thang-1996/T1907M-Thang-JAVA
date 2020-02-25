package bai1;

import java.util.Scanner;

public class TamGiac {
    public int a;
    public int b;
    public int c;
    public TamGiac(){

    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double Chuvi(){
        return a+b+c;
    }
    public double P(){
        return (a+b+c)/2;
    }
    public double dienTich(){
        return Math.sqrt(P()*(P()-a)*(P()-b)*(P()-c));
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
