package com.company;

public abstract class BaseClass {

    private static Integer salary;

    public BaseClass(int salary){
        this.salary = salary;
    }

    public Integer getSalary (){
       return salary;
    }

     public abstract  void Salary(int salary);
}
