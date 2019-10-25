package com.company;

public class Treygolnik {
        static int a;
        static int b;
        static int c;

        public Treygolnik (int a,int b, int c){

            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void Print(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        public void Plosh() {
            double p;
            double s;
            if (a < c && b < c && c > 0 && c<(a+b)) {
                p = ((a + b + c) / 2);
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println(" ");
                System.out.println("Перимертр у нас будет равно" + " " + p);
                System.out.println(" ");
                System.out.println("Площадь равна" + " " + s);
            }else{
                System.out.println("Введите A > C (и не меньше 0-ля), B > C (и не меньше 0-ля)");
            }
        }
    }
