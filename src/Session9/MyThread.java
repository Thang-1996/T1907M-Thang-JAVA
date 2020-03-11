package Session9;

public class MyThread extends Thread {
        public void run() {
            for(int i=0;i<10;i++){
                if(i%2==0){
                    System.out.println(i);
                }
                try{
                    Thread.sleep(1500);
                }catch (Exception e){

                }
        }
            System.out.println("Current Name :"+Thread.currentThread().getName());
            Thread.currentThread().setName("myJavaThread");
            System.out.println("After ChangeName:"+Thread.currentThread().getName());
    }
}
