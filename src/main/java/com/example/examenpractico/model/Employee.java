package com.example.examenpractico.model;

public class Employee extends User{
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(String id, String username, String phone, String email, Double salary) {
        super(id, username, phone, email);
        this.salary = salary;
    }
}
