package Assigment3;

import java.util.ArrayList;

public class PersonModel<Person> {
    ArrayList<Person> person = new ArrayList<>();
   public void addPerson(Person Person){
       person.add(Person);
   }
   public void showPerson(){
       for(Person p : person){
           System.out.println(p.toString());
       }
   }
}
