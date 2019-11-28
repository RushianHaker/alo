package com.company;

public abstract class BaseClass {

    private Integer salary;

    BaseClass(int salary) {
        this.salary = salary;
    }


    public abstract void Salary(int salary);

    Integer getSalary() {
        return salary;

    }
}
