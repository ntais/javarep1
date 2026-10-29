/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprojectf2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iektm1-12
 */
public class JavaProjectF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person pe1, pe2, pe3;
        String onoma, tmp;
        double ilikia;
        int done;
        Person p1, p2, p3;
        Employee emp1,emp2;
        
        p1 = new Person("Ελένη",38,22);
        p2 = new Person("Δημήτρης", 28,Person.male);
        p3 = new Person("Ιωάννα",23.5);
        p3.setGender(Person.female);
        
        System.out.println(p1.description());
        System.out.println(p2.description());
        System.out.println(p3.description());

       pe1= new Person();
        do{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("dwse onoma:");
            onoma = sc.nextLine();
            System.out.println("dwse hlikia:");
            tmp = sc.nextLine();
            ilikia = Double.parseDouble(tmp);

            pe1 = new Person(onoma, ilikia);
            System.out.println(pe1.description());
             done=1;

        } catch (NullPointerException e) {
            System.out.println("Δώθηκε null String. " + e.getMessage());
            done=0;
        } catch (NumberFormatException e) {
            System.out.println("Δέν δόθηκε πραγματικός αριθμός." + e.getMessage());
            done=0;
        }
        }while (done!=1);
        
        emp1 = new Employee(1200.5,"Εκπαιδευτικός");
        emp2 = new Employee("Χρήστος",25.6,1200,"Ηλεκτρολόγος");
        
        emp1.setAge(32);
        emp1.setName("Κώστας");
        System.out.println(emp1.description());
        System.out.println(emp2.description());
        
        ArrayList<Person>persons;
        persons = new ArrayList<Person>();
        
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        
        persons.add(emp1);
        persons.add(emp2);
        
        persons.add(pe1);
        
        System.out.println(persons.size());
        for (int i=0;i<persons.size();++i)
            System.out.println(persons.get(i).description());
        
        for (int i=0;i<persons.size();++i){
            Person p =persons.get(i);
            if(p instanceof Employee)
                System.out.println("Το στοιχείο"+(i+1)+"Είναι Employee");
            else
                 System.out.println("Το στοιχείο"+i+"Είναι Person");
          }
        
       
        
        
    }
    
    

}
