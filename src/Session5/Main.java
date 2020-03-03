package Session5;

import java.io.*;

public class Main {
    public static void main(String[] args)  throws Exception{
        int x = 0;
        int y = 10;
        try {
            int z = x / y; // z = 0
            System.out.println(z);
            // đến chỗ chưa lỗi sẽ đặt chủ động throws vào sau phương thức
//            if(x<=0) throw new Exception("Lỗi"); // sẽ dừng ở dòng lỗi
            System.out.println("Chay tiep");// không chạy tiếp dòng này
            z = y / x; // z == 0 lỗi vì không thể chia cho 0
            System.out.println(z);
            // những lệnh mà chắc chắn sẽ đúng thì sẽ đặt ở ngoài try
            // đến runtime bị lỗi sẽ dừng công việc ở try và nhảy xuống chạy ở catch
        } catch (Exception e) {
            System.out.println("Lỗi rồi");
        }

        // tạo file handing
        try{
            File f = new File("D:\\data.txt");
            String st = "";
            if(f.canRead()){
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                st = dis.readLine();
                System.out.println(st);
                dis.close();
                fis.close();
            }
            if(f.canWrite()){
                FileOutputStream fos = new FileOutputStream(f); // truyền file vào để viết dữ liệu
                DataOutputStream dos = new DataOutputStream(fos); // truyền khi đã ghi xong file vào data
                dos.writeChars(st+"Xin chao day la dong dau tien \n");
                dos.close(); // đóng toàn bộ kết nối
                fos.close();
            }
        }catch(Exception e){
            System.out.println("không tìm thấy file");
        }

    }
}
