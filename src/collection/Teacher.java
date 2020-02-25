package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {

    // collection là tập hợp gồm các phần tử trong đó có các loại :
    // list : giống như arraylist khởi nguồn
    //set : là 1 dạng tập hợp nhưng không có sự trùng lặp
    // queue : hàng chờ và sẽ có hàng chờ ưu tiên
    // map : sẽ làm việc theo tập hợp nhưng phần tử sẽ được gắn nhãn chứ không phải thứ tự phần tử 1-2-3-4
    // class tiêu biểu cho interface
//Arraylist :  đặc trưng class cho List
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");// thêm phần tử vào arraylist
        stringArrayList.add("world");
        System.out.println("Kich thuoc tap hop"+stringArrayList.size());
        if(stringArrayList.isEmpty()){ // isemplty kiểm tra xem có trống không
            System.out.println("empty");
        }
        // remove sẽ xóa phần tử theo vị trí
        // hash set giống như arraylist nhưng điểm khác biệt là trong hashset không thể có các phần tử trùng nhau
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("aa");
        stringHashSet.add("aa");
        stringHashSet.add("cc");
        stringHashSet.add("aa");
        System.out.println("Inr ra hash set: ");
        for(String s: stringHashSet){ // for-each
            System.out.println(s);
        }
        // tập hợp ưu tiên
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("bb");
        priorityQueue.add("cc");
        priorityQueue.add("aa");
        priorityQueue.add("aa");
        System.out.println("Inr ra priority quere: ");
//        for(String s : priorityQueue){
//            System.out.println(s); // in ra sẽ được sắp xếp theo alphab
//        }
        // cách lấy ra sử dụng priority queur
        for(;!priorityQueue.isEmpty();){ // kiểm tra xem đang còn hay không
            System.out.println(priorityQueue.poll()); // poll là sẽ lấy ra từng phần tử ra và xóa đi phần tử bị trùng
        }
        //Hashmap sẽ được truyền vào key : và value
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("phongcualinh","phong10m2"); // dùng để thêm phần tử vào // gồm nhãn tên và value
        hashMap.put("phongcuaVA","phong12m2");
        hashMap.put("phongcuahuyen","phong8m2");
        hashMap.put("phongcuanhan","phong5m2");
        // in ra
        System.out.println("phong cua ban linh : "+hashMap.get("phongcualinh")); // dùng get và điền key đã khai báo vào
        // kiểu số
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(0,"xin chao thu 4");
        hashMap1.put(2,"xin chao thu 5"); // key hay value căn cứ vào kiểu dữ liệu truyền vào
        hashMap1.put(3,"xin chao thu 7");
        System.out.println(hashMap1.get(2));
    }
    @Override
    public String toString() { // tất cả lớp không extend thì sẽ extend object
        return super.toString();
    }
}


