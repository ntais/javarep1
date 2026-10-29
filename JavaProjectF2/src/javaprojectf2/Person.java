/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojectf2;

/**
 *
 * @author iektm1-12
 */
public class Person {

    public final static int male = 1;
    public final static int female = 2;
    public final static int nogender = 3;
    protected String Onoma;
    protected double age;
    protected int gender;

    public void setName(String s) {
        Onoma = s;
    }

    public String getName() {
        return Onoma;
    }

    public void setAge(double a) {
        age = a;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int g) {
        if (g == male || g == female) 
            gender = g;
        else 
           gender = nogender;
    }

    public double getAge() {
        return age;
    }

    Person() {
        Onoma = "";
        age = 0;
        gender = nogender;
    }

    Person(String Onoma, double age) {
        this.Onoma = Onoma;
        this.age = age;
        gender = nogender;
    }

    Person(String Onoma, double age, int gender) {
        this.Onoma = Onoma;
        this.age = age;
        setGender(gender);
    }
    //Method Overriding
    public String description() {
        String g;
        if (gender == male) {
            g = "Person: Ο" + Onoma + " einai " + age + " Xronon .Gender="+gender;
        } else if (gender == female) {
            g = "Person: Η" + Onoma + " einai " + age + " Xronon .Gender="+gender;
        } else {
            g = "Person: " + Onoma + " einai " + age + " Xronon .Gender="+gender;
        }
        return g;
    }

    public String print() {
        return "Name: " + Onoma + ", Hlikia: " + age;
    }
}
