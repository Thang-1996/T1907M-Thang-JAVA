package Session9;

public class CounterF1 extends Thread { // kế thừa lớp thread
    // công việc tạo lớp con kế thừa lớp thread và viết ra hàm sẽ làm công việc trước và song song với công việc chính của hàm main
    public void run(){
        // việc sẽ chạy ở luồng mới
        // làm 1 việc khác luồng cũ
        // 2 luồng sẽ chạy song song nhau làm tiếp công việc không liên quan đến nhau
        for (int i =0;i<100;i++){
            System.out.println("F1 - "+i);
            try{
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
        System.out.println("Thread: "+Thread.currentThread().getName());
        System.out.println("F1 Finish");
        // thread mới tạo sẽ là thread -0
        // đổi tên thread
        Thread.currentThread().setName("Counter F1");
        System.out.println("After Change Name: "+Thread.currentThread().getName());
    }
}
