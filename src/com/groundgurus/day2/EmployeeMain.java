package com.groundgurus.day2;

/**
 *
 * @author penguin
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "M", "Smith", 
                "Clerk", "Management", 
                new Address("123 Acme", "", "Mandaluyong", "Manila", "5001"));
        emp1.printDetails();
        
        System.out.println();
        
        Employee emp2 = new Employee("Jessy", "M", "Smith", 
                "Assistant Manager", "Management", 
                new Address("123 Acme", "", "Mandaluyong", "Manila", "5001"));
        emp2.printDetails();
    }
}
