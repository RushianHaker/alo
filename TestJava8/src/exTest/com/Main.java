package exTest.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Max",3);
        Student student2 = new Student("Masha",1);
        Student student3 = new Student("George",3);
        Student student4 = new Student("Igor'",1);
        Student student5 = new Student("Andrey",2);


        Student[] c = {student1,student2,student3,student4,student5};

        Arrays.sort(c);
        //второе возможное условие, которое можно вставить вместо обычной сортировки
        // и отсортировать по длине именни - (a,b)-> a.name.length() - b.name.length()

        for (Student s: c) {
            System.out.println(s);
        }
    }
}
