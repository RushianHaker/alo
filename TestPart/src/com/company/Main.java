package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        ClassRoom classRoom = new ClassRoom(new ExcelPupil(),new BadPupil());
        classRoom.show();
    }
}
