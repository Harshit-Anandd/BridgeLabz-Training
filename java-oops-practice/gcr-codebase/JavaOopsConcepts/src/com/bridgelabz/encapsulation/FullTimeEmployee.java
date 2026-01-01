package com.bridgelabz.encapsulation;

public class FullTimeEmployee extends Employee implements Department {
    private String departmentName;
    private double bonus;

    public FullTimeEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }
}