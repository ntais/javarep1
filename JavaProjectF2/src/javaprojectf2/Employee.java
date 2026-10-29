/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojectf2;

/**
 *
 * @author iektm1-12
 */
public class Employee extends Person{
    
    private double salary;
    private String Job;
    
    
    
        public void setsalary( double s) {
            if(salary>=0)
                salary = s;
    }

    public double getsalary() {
        return salary;
    }
    
        public void setjob( String j) {
        Job=j;
    }

    public String  getjob() {
        return Job;
    }
    
    Employee(){
        super();
        salary = 0.0;
        Job = "";
    }
    
      Employee(double salary,String job){
        super();
        this.salary = salary;
        this.Job = job;
    }
      
         Employee(String n,double a,double salary,String job){
        super(n,a);
        this.salary = salary;
        this.Job = job; 

    }
         
        Employee(String n,double a,double salary,String job,int gender){
        super(n,a,gender);
        this.salary = salary;
        this.Job = job; 

    }
          public String description(){
          String s = "Employee:"+getName()+",Είναι "+getAge();
          s = s +" ,Και εργάζεται ως "+Job+" με μισθό "+salary;
          return s;
      }
                  
}
