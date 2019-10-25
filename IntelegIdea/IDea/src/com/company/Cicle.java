package com.company;

public class Cicle {
    static Vector2 vector;
    static Vector2 vector2;
    static int r;

    public Cicle(Vector2 vector, Vector2 vector2,int r){
        this.vector = vector;
        this.vector2=vector2;
        this.r = r;
    }

    public static void SearchDot(){
        int dot = (vector2.X - vector.X) + (vector2.Y - vector.Y);
        if(dot > r){
            System.out.println("Она не лежит на окружности");
        }else {
            System.out.println("Точка" +" "+ Math.abs(dot) + " " + "лежин на окружности");
        }
    }
}
