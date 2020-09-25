package com.company;

public final class Singolton {

        private static Singolton inctance;
        public String value;

    public Singolton(String value) {
        this.value = value;
    }

    public static Singolton getInstance(String value){
        if(inctance == null){
            inctance = new Singolton(value);
        }
        return inctance;
    }
}
