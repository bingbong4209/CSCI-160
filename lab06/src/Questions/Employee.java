/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author User
 */
public class Employee {
    
    String name;
    int ID;
    double salary;
    
    public Employee()
    {
        name = "Joe Schmoe";
        ID = 12345;
        salary = 37000.00;
    }
    
    public Employee(String name, int ID, double salary)
    {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        
        if(this.name == null || this.name == "") {
            this.name = "No Name Given";
        } else {           
        }
        
        if(this.ID < 0) {
            this.ID = 0;
        } else if(this.ID > 100000) {
            this.ID = 99999;
        } else {           
        }
        
        if(this.salary < 20000) {
           this.salary = 20000;
        } else {
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setName(String name)
    {
        this.name = name;
        
        if(this.name == null || this.name == "") {
            this.name = "No Name Given";
        } else {           
        }
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
        
        if(this.ID < 0) {
            this.ID = 0;
        } else if(this.ID > 100000) {
            this.ID = 99999;
        } else {           
        }
    }
    
    public void setSalary(double salary)
    {           
       this.salary = salary;
    
       if(this.salary < 20000) {
           this.salary = 20000;
       } else {
       }
    }
    
}
