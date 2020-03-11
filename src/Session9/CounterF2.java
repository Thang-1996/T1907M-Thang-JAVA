package Session9;

public class CounterF2 implements Runnable {
    // implements runnable thay cho extend lớp thread
    @Override
    public void run() {
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
