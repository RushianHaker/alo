package com.company;

public class Rect {
   static Vector2 vector;
   static Vector2 vector2;

    public Rect(Vector2 vector, Vector2 vector2){
       this.vector = vector;
       this.vector2 = vector2;
    }
    public static void Perimetr(){
        int per = (vector2.X - vector.X) + (vector2.Y - vector.Y);
        System.out.println(Math.abs(per));
    }

    public static void Plosh(){
        int plosh = (vector2.X - vector.X) * (vector2.Y - vector.Y);
        System.out.println(Math.abs(plosh));
    }
}
