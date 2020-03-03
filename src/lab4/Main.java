package lab4;

public class Main {
    public static void main(String[] args) {
      Mobile<String,String,Integer> mobile = new Mobile<String,String,Integer>();
        mobile.addMobile(new Mobile("Samsung","galaxynote",2020));
        mobile.guaranteeCheck();

    }
}
