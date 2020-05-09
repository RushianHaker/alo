package com.company;

public class Main {


    public static void main(String[] args) {
        Student st = new Student("Misha",19,"Ivanov");

        st.setMenType(new SportsMen());

        Worker wr = new Worker("Lesha",40,"Isaev");

        wr.setMenType(new FatMen());

        OfficeWorker of = new OfficeWorker("Ivan",25, "Ibragimov");

        of.setMenType(new ClassicMen());
    }
}
