package Session9;

public class Session9 {
    public static void main(String[] args) {
        CounterF1 cf1 = new CounterF1();
//        cf1.run(); // vẫn là đơn luồng
        // cf1 sẽ chạy trước sau đó mới thực hiện công việc bên dưới
        // đa luồng sẽ sử dụng hàm start
        // set Priority
        cf1.setPriority(8); // xét độ ưu tiên sử dụng Thread.MAX_PIORITY sẽ được ưu tiên và sẽ có giá trị ưu tiên từ 1-10
        cf1.start();
        // cách sử dụng khi implements
        CounterF2 cf2 = new CounterF2();
        Thread th = new Thread(cf2);
        th.start();
        // lớp ẩn danh tạo ra lớp không cần phải viết file mới và có thể dùng các biến local vào trong hàm void run
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread tạo từ lớp ấn danh");
            }
        };
        new Thread(r1).start();
        // 2 luồng sẽ chạy song song nhau
        // lambda expression
        // nếu có 1 interface mà trong interface chỉ có 1 hàm thì gọi ra functional interface
        Runnable r2 = ()->{
            System.out.println("Thread tạo từ lớp ấn danh");
        };
        // tương đương như r1
        new Thread(r2).start();
        for(int i=0;i<100;i++){
            System.out.println("main -"+i);
            try{
                // sử dụng hàm thread.sleep để cho luồng hiện tại nghỉ 1 thời gian ms và sau thời gian đó sẽ tự động chạy tiếp
                Thread.sleep(100);
            }catch(Exception e){

            }
        }
//        System.out.println("Main Finish");
        // cách in ra tên luồng hiện tại
        System.out.println("Thread: "+Thread.currentThread().getName());
    }
}
