package lab4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mobile<S,T,N> {
    private S brand;
    private T series;
    private N year;

    public Mobile(S brand, T series, N year) {
        this.brand = brand;
        this.series = series;
        this.year = year;
    }

    public Mobile() {

    }

    public S getBrand() {
        return brand;
    }

    public void setBrand(S brand) {
        this.brand = brand;
    }

    public T getSeries() {
        return series;
    }

    public void setSeries(T series) {
        this.series = series;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand=" + brand +
                ", series=" + series +
                ", year=" + year +
                '}';
    }

    ArrayList<Mobile> mobileList = new ArrayList<>();

    public void addMobile(Mobile mobile) {
        mobileList.add(mobile);
    }

    public boolean guaranteeCheck() {
        LocalDate nows = LocalDate.now();
        for (Mobile m : mobileList) {
            if ((Integer) m.year < nows.getYear()) {
                System.out.println(m.toString());
                System.out.println("\n" +
                        "The product is out of guarantee");
                return false;
            } else {
                System.out.println(m.toString());
                System.out.println("\n" +
                        "The product still have guarantee");
            }
        }
        return true;
    }
}
