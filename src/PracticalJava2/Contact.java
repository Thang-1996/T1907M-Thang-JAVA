package PracticalJava2;

import java.util.Scanner;

public class Contact {
    private String Name;
    private String Company;
    private String Email;
    private String Phone;

    public Contact(String name, String company, String email, String phone) {
        Name = name;
        Company = company;
        Email = email;
        Phone = phone;
    }

    public Contact() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString() {
        return "\tName :"+Name+"\tCompany Name"+Company+"\tEmail :"+Email+"\tPhoneNumber:"+Phone;
    }
}
