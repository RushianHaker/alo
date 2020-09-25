package com.company;

public final class Singolton {

   private static Singolton instance;

    private Singolton() {
        String a = "Fuck me!";
    }

    public static Singolton getInstance(){
        if(instance == null){
            instance = new Singolton();
        }
        return instance;
    }

}
