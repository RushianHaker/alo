package com.company;

import java.util.Arrays;

public class ClassRoom {

    private Pupil[] pupils;

    public ClassRoom() {
        pupils = new Pupil[]{
                new BadPupil(),
                new ExcelPupil(),
                new GoodPupil(),
                new BadPupil()
        };
    }

    public ClassRoom(Pupil ivanov, Pupil kirinkov, Pupil scorohodov, Pupil lenina) throws Exception {
        this.pupils = new Pupil[]{
                ivanov,
                kirinkov,
                scorohodov,
                lenina
        };
    }

    public ClassRoom(Pupil ivanov, Pupil kirinkov, Pupil scorohodov) throws Exception {
        this(ivanov, kirinkov, scorohodov, new ExcelPupil());
    }

    public ClassRoom(Pupil ivanov, Pupil kirinkov) throws Exception {
        this(ivanov, kirinkov, new GoodPupil(), new BadPupil());
    }


    public void show() {
        Arrays.stream(this.pupils)
                .forEach((pupil) -> {
                    System.out.println( "- read: ");
                    pupil.read();
                    System.out.println("- relax: ");
                    pupil.relax();
                    System.out.println("- study: ");
                    pupil.strudy();
                    System.out.println("- write: ");
                    pupil.write();
                });
    }
}
