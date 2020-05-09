package com.company;

public class Human {

    private Road road;

    String name;

    int age;

    String LastName;

    public Human(String name, int age, String LastName) {
        this.name = name;
        this.age = age;
        this.LastName = LastName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return LastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }


    public void setMenType(Road newroad) {
        road = newroad;
    }
}
