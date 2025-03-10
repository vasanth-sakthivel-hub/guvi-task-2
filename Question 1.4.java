package com.google;

// Base class
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass
class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor using super keyword
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Corrected this line
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployee() {
        displayPersonInfo(); // Display inherited attributes
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }
}

// Main class
class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 25, 101, 50000);
        emp.displayEmployee();
   }
}

