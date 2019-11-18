package com.company;

public class First extends BaseClass {

    double hour_money;

    public First(int salary) {
        super(salary);
    }

    @Override
    public void Salary(int salary) {
        System.out.println("Введите ставку: " + salary);
        hour_money = 20.8 * 8 * salary;
        salary = (int) (hour_money);
        System.out.println("Зарплата почасовщика: " + salary);
    }
}
