package com.company;

public class Second extends BaseClass {

    Second(int salary) {
        super(salary);
    }

    @Override
    public void Salary(int salary) {
        System.out.println("Фиксированная зарплата: " + salary);
    }
}
