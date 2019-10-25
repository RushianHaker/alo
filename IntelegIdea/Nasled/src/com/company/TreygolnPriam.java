package com.company;

public class TreygolnPriam extends Treygolnik{

    public TreygolnPriam(int a, int b, int c) {
        super(a, b, c);
    }

    public void Plosh() {
        double p;
        double s;
        if (c > 0 && (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))) {

            p = ((a + b + c) / 2);
            s = ((a*b)/2);

            System.out.println(" ");
            System.out.println("Перимертр у нас будет равно" + " " + p);
            System.out.println(" ");
            System.out.println("Площадь равна" + " " + s);
        }else{
            System.out.println("Прямоугольного треуголька с такими данными не существует");
            System.out.print(" ");
            System.out.println("Введите данные согласно правилу пифагора (a^2 + b^2 = c^2)");
        }
    }

}
