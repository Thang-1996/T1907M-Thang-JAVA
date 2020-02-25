package demo2;

import com.company.Car;

public class Toyota extends Car {
    protected int price;
    public Toyota(int year, String typeCar, String brand,int price) {
        super(year,typeCar,brand);// chay lay cac bien khoi tao tu class car
        this.price = price;
    }
    public void showInfo(){
        super.getInfo();
        this.setYear(2020);
        System.out.println("Year"+year);
            }

}
