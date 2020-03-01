public class lythuyet {
    // tính chất ghi đè
    //gồm các phương thức có cùng class nạp chồng
    // tham số truyền vào của phương thức gọi không thể giống nhau kiểu dữ liệu nhưng khi viết trong cùng 1 function thì có thể giống nhau về kiểu dữ liệu nhưng phải khác nhau về tên biến trả về còn 2 phương thức khác nhau sẽ khác nhau về số lượng tham số trả về
    // tên giống với lớp cha

    // interface

    // buổi 2 : collection
    //   // sử dụng localdate để so sánh
    //        //LocalDate madeyear = LocalDate.of((Integer) year,1,1); // sẽ tạo ra 1 object của localdate lấy theo ngày tháng máy tính
    // trong package JavaTime gói làm việc với ngày giờ trong java
    // lấy ngày hiện tại dùng .now() , lấy ngày chính xác dùng .of(year,month,day) điền chính xác ngày
    // nhận vào 1 chuỗi ra muốn convert ra ngày chính xác dùng .parse(chuỗi string tương ứng với ngày )
    // LocalDateTime dt = LocalDateTime.now(year,month,day,hour,minute,second); //  ngày và giờ chính xác
    //minusyear lấy ngày tăng giảm ngày tháng

    // vd kiểm tra 1 năm có phải năm nhuận ko ?
    //= LocalDate kt = LocalDate.of(năm kiểm tra ,month(2),day(28));
    // LocalDate nextDay = kt.plusDays(1);
    // if(nextDay.getDayofMonth() == 29){
    //  // năm nhuận
    // }
}
