package PhoneManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<User> phoneList = new ArrayList();

    @Override
    public void insertPhone(String name, String phone) {
    for(User user : phoneList){ // for earch
        if(user.name.equals(name)){
            if(user.sdt.equals(phone)){
                return;
            }
            user.sdt = user.sdt + " : " +phone;
            return;
        }
    }
    phoneList.add(new User(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(User user : phoneList){
            if(user.name.equals(name)){
                phoneList.remove(user);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for(User user :phoneList){
            if(user.name.equals(name)){
                user.setSdt(newphone);
                return;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for(User user :phoneList){
            if(user.name.equals(name)){
                System.out.println("contact co trong list");
                System.out.println("name"+user.getName());
                System.out.println("sdt"+user.getSdt());
                return;
            }else{
                System.out.println("contact khong co trong list");
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for(User user : phoneList){
            System.out.println(user.name+":"+user.sdt);
        }
    }
}
