package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap canh 1: ");
            a = sc.nextInt();
            System.out.println("Nhap canh 2: ");
            b = sc.nextInt();
            System.out.println("Nhap canh 3: ");
            c = sc.nextInt();
        } while (!checkTamgiac(a, b, c));
        TamGiac tg = new TamGiac(a, b, c);
        System.out.println("Dien tich: " + tg.dienTich());
        System.out.println("Chu vi tam giac : " + tg.Chuvi());
    }

    public static boolean checkTamgiac(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {

            if (a==b && b==c) {
                System.out.println("Day la tam giac deu");
            }else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
                System.out.println("Day la tam giac vuong");
            }
            else if(a == b || b == c || c == a) {
                System.out.println("Day la tam giac can");
            }
            return true;
        } else {
            System.out.println("Khong phai la 3 canh cua 1 tam giac");
            return false;
        }
    }
}
