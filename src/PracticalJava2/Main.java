package PracticalJava2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactList contact = new ContactList();
        Scanner sc = new Scanner(System.in);
        int choice;
        String name, company, email, phone;
        do {
            System.out.println("1: Add new Contact:");
            System.out.println("2: Find by contact name:");
            System.out.println("3: Display Contact");
            System.out.println("4: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name");
                    name = sc.next();
                    System.out.println("Enter company name");
                    company = sc.next();
                    System.out.println("Enter email address");
                    email = sc.next();
                    System.out.println("Enter phone number");
                    phone = sc.next();
                    contact.addContact(new Contact(name, company, email, phone));
                    break;
                case 2:
                    String nameFind;
                    System.out.println("Enter name to find: ");
                    nameFind = sc.next();
                    contact.findContact(nameFind);
                    break;
                case 3:
                    contact.showContact();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice ! 1-4");
                    break;
            }
        }while (choice!=4);
    }
}
