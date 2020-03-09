package Sesson6;

import java.util.ArrayList;

public interface DataAcessObjectConCreate<E> { // e đại diện cho nhiều bẳng đối tượng
    ArrayList<E> list();
    Boolean create(E e); // trả về đối tượng boolean đúng hoặc sai khi tạo đối tượng
    Boolean update(E e);
    Boolean delete(E e);
}
