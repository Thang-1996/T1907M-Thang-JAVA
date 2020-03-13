package Pratical;

import java.util.ArrayList;
import java.util.Scanner;

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
            for(int i=0;i<contacts.size();i++){
                Contact contact = contacts.get(i);
                if(contact.getName().equals(name)){
                    System.out.println("Name: "+contact.getName()+"Company:"+contact.getCompany()+"Email: "+contact.getName()+"Phone:"+contact.getPhone());
                    return true;
                }
            }
            System.out.println("Contact not found");
            return false;
        }


}
