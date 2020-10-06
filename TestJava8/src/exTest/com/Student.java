package exTest.com;

public class Student implements Comparable<Student>{
    public String name;
    public int group;

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public int compareTo(Student o) {
        return this.group - o.group;
    }

    @Override
    public String toString() {
        return "name - " + name + ", group -" + group;
    }
}
