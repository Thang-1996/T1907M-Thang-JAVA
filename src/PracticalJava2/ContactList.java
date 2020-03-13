package PracticalJava2;

import java.util.ArrayList;

public class ContactList {
        ArrayList<Contact> contacts = new ArrayList<>();
        public void addContact(Contact contact){
            contacts.add(contact);
        }
        public void showContact(){
            for(Contact c : contacts){
                System.out.println(c.toString());
            }
        }
        public boolean findContact(String name){
            for(Contact c : contacts){
                if(c.getName().equals(name)){
                    System.out.println("Name: "+c.getName()+"Company:"+c.getCompany()+"Email: "+c.getName()+"Phone:"+c.getPhone());
                    return true;
                }
            }
            System.out.println("Contact not found");
            return false;
        }


}
