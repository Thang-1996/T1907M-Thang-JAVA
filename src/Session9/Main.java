package Session9;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Chúc Mừng");
            }
        };

    }
}
