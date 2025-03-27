package com.java.collection;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // 1. Create ArrayList to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // 2. Add initial employees
        employees.add(new Employee(101, "Alice", 60000));
        employees.add(new Employee(102, "Bob", 55000));
        employees.add(new Employee(103, "Charlie", 75000));

        // 3. Insert new employee at index 1
        employees.add(1, new Employee(100, "Ganga", 80000));
        employees.add(1, new Employee(104, "Diana", 80000));

        // 4. Remove employee with ID 102
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).getId() == 102){
                employees.remove(i);
                break;
            }
        }

        // 5. Print all employees
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // 6a. Find highest-paid employee
        Employee highestPaid = employees.get(0);
        for (Employee emp : employees) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }
        System.out.println("\nHighest-Paid Employee: " + highestPaid);

        // 6b. Calculate average salary
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }
        double averageSalary = totalSalary / employees.size();
        System.out.printf("Average Salary: %.2f", averageSalary);
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString() for printing
    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', salary=%.1f}", id, name, salary);
    }
}