package com.company;

public class Second extends BaseClass {

    public Second(int salary) {
        super(salary);
    }

    @Override
    public void Salary(int salary) {
        System.out.println("Введите фиксированная зарплата: " + salary);
    }
}
