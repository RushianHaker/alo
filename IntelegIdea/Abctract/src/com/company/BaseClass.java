package com.company;

public abstract class BaseClass {

    private static Integer salary;

    BaseClass(int salary) {
        BaseClass.salary = salary;
    }

    Integer getSalary() {
        return salary;
    }

    public abstract void Salary(int salary);
}
