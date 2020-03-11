package LAB7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = () -> {
//                for (int i = 10; i > 0; i--) {
//                    System.out.println(i);   // đếm ngược 10s
            for (int i = 10; i>=0;i--) {
                for(int j=59;j>0;j--){
                    if(i==10 && j<10){
                        System.out.println(i+":"+"0"+j);
                    }
                    else if(i==10 && j>10){
                        System.out.println(i+":"+j);
                    }
                    else if(j<=9) {
                        System.out.println("0"+i+":"+"0"+j);
                    }else{
                        System.out.println("0"+i+":"+j);
                    }
                }
                try{
                    Thread.sleep(100);
                }catch (Exception e){}
            }
            System.out.println("Chúc Mừng Đã Đếm Xong");
        };
        new Thread(r1).start();
    }
}
