package Generic;
// tham số hóa kiểu dữ liệu

public class Generic<K,V> { // đang khai báo lớp generic có 2 tham số hóa dữ liệu K và V
    public K name;
    public V phone;
    public K getName(){
        return name;
    }
    public V getPhone(){
        return phone;
    }
    public void setName(K name){ // k và v sẽ tương ứng cho các kiểu dữ liệu bình thường string interger double float
        this.name = name;
    }
    public void setPhone(V phone){ //
        this.phone = phone;
    }
//    public void showMessage(String msg){
//        System.out.println(msg);
//    }
//    public void showMessage(Integer msg){
//        System.out.println(msg);
//    }
    // muốn viết kiểu hàm mà sẽ truyền vào tham số random thì sẽ viết là
    public <E> void showMessage(E msg){ // trước là kiểu dữ liệu tương ứng với e sau là tên ứng với thông số sẽ truyền vào
        System.out.println(msg);
    }
    // truyền vào 1 e(đặt tên tùy ý) bất kỳ tương ứng vói mọi kiểu dữ liệu khi truyền thông số vào dữ liệu đó sẽ dựa vào giá trị truyền vào để xác định e là kiểu gì
    // 2 hàm giống nhau về nội dung nhưng khác nhau về tham số là truyền vào chuỗi hoặc số
    // TRUYỀN VÀO kiểu object sẽ truyền K,V, e là để truyền vào kiểu dữ liệu bất kỳ
}
