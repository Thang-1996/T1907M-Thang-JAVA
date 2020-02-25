//package Assigment1;
//
//import java.util.Scanner;
//
//public class Fraction {
//    public int tuSo;
//    public int mauSo;
//    public Fraction(){
//
//    }
//
//    public Fraction(int tuSo, int mauSo) {
//        this.tuSo = tuSo;
//        this.mauSo = mauSo;
//    }
//
//    public int getTuSo() {
//        return tuSo;
//    }
//
//    public void setTuSo(int tuSo) {
//        this.tuSo = tuSo;
//    }
//
//    public int getMauSo() {
//        return mauSo;
//    }
//
//    public void setMauSo(int mauSo) {
//        this.mauSo = mauSo;
//    }
//    public void inputFraction(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter tu so : ");
//        tuSo = sc.nextInt();
//        System.out.println("Enter mau so : ");
//        mauSo = sc.nextInt();
//        setMauSo(mauSo!=0?mauSo:1); // nếu mẫu số #0 thì sẽ lấy giá trị mẫu số còn == 0 thì sẽ cho mẫu số = 1
//    }
//    public void printFraction(){
//        System.out.println(getTuSo()+ "/" + getMauSo());
//    }
//    public int UCLN(){
//        int tuSo = Math.abs(getTuSo()); // Math.abs là lấy giá trị tuyệt đối
//        int mauSo = Math.abs(getMauSo());
//        int ucLN = 1;
//        for(int i=1;i<Math.min(tuSo,mauSo);i++){
//            if(tuSo%i == 0 && mauSo%i == 0){
//                ucLN = i;
//            }
//        }
//        return ucLN;
//    }
//    public void compactFraction(){
//        int ucln = UCLN();
//        setTuSo(getTuSo()/ucln);
//        setMauSo(getMauSo()/ucln);
//    }
//    public void inverseFraction(){
//        if(getTuSo() != 0){
//            int temp = getTuSo(); // tạo 1 biến để lưu giá trị trước khi đảo ngược
//            setTuSo(getMauSo()); //  nếu thỏa mãn điều kiện thì đảo ngược tử số với mẫu số
//            setMauSo(temp);
//        }else{
//            System.out.println("Khong the dao nguoc phan so");
//        }
//    }
//    public Fraction addFraction(Fraction fraction){
//        Fraction sumFraction = new Fraction();
//        sumFraction.setMauSo(this.getMauSo() * fraction.getMauSo());
//        sumFraction.setMauSo(this.getTuSo() * fraction.getMauSo() + this.getMauSo()*fraction.getTuSo());
//        return sumFraction;
//    }
//    public Fraction subFraction(Fraction fraction){
//        Fraction subFraction = new Fraction();
//        subFraction.setMauSo(this.getMauSo() * fraction.getMauSo());
//        subFraction.setMauSo(this.getTuSo() * fraction.getMauSo() - this.getMauSo()*fraction.getTuSo());
//        return subFraction;
//    }
//    public Fraction mulFraction(Fraction fraction){
//        Fraction mulFraction = new Fraction();
//        mulFraction.setMauSo(this.getMauSo() * fraction.getMauSo());
//        mulFraction.setTuSo(this.getTuSo() * fraction.getTuSo());
//        return mulFraction;
//    }
//    public Fraction divFraction(Fraction fraction){
//        Fraction divFraction = new Fraction();
//        divFraction.setTuSo(this.getTuSo() * fraction.getMauSo());
//        divFraction.setMauSo(this.getMauSo() * fraction.getTuSo());
//        return divFraction;
//    }
//}
