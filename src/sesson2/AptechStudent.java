package sesson2;

public class AptechStudent extends Student implements StudentInterface,HumanInterface { // khi kế thừa thì phải viết lại phương thức cho kế thừa


    @Override
    public void showInfo() {
        System.out.println("hello student");
    }

    @Override
    public void running() {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eating() {

    }
}
