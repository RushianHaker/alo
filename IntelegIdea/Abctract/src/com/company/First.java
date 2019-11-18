package com.company;

public class First extends BaseClass {
    First(int salary) {
        super(salary);
    }

    @Override
    public void Salary(int salary) {
        salary = (int) 20.8 * 8 * salary;
        System.out.println("Зарплата почасовщика: " + salary);
    }
}
