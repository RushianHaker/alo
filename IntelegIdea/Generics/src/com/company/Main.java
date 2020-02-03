package com.company;

public class Main {

    public void main(){

        Cargo cargoBarbell  = new Cargo();
        Cargo cargoDumbbells = new Cargo();
        Cargo cargoDumbbells2 = new Cargo();

        Dumbbells redDumbbells = new Dumbbells(30);
        Dumbbells blueDumbbells = new Dumbbells(20);
        Dumbbells yellowDumbbells = new Dumbbells( 10);

        Dumbbells redDumbbells2 = new Dumbbells(32);
        Dumbbells blueDumbbells2 = new Dumbbells(22);
        Dumbbells yellowDumbbells2 = new Dumbbells(12);

        Barbell redBarbell = new Barbell(15);
        Barbell blueBarbell = new Barbell(25);
        Barbell yellowBarbell = new Barbell(35);

            cargoDumbbells.Add(redDumbbells);
            cargoDumbbells.Add(blueDumbbells);
            cargoDumbbells.Add(yellowDumbbells);

                cargoDumbbells.AllWeight();
                cargoDumbbells.PrintWeight();

             cargoDumbbells2.Add(redDumbbells2);
             cargoDumbbells2.Add(blueDumbbells2);
             cargoDumbbells2.Add(yellowDumbbells2);

                cargoDumbbells2.AllWeight();
                cargoDumbbells2.PrintWeight();

            cargoBarbell.Add(redBarbell);
            cargoBarbell.Add(blueBarbell);
            cargoBarbell.Add(yellowBarbell);

                cargoBarbell.AllWeight();
                cargoBarbell.PrintWeight();

             cargoDumbbells.CheckTwoWeights(cargoDumbbells.AllWeight(),cargoBarbell.AllWeight());

             cargoBarbell.TransferCargo(cargoDumbbells2);

                cargoDumbbells.AllWeight();
                    cargoDumbbells.PrintWeight();
                cargoDumbbells2.AllWeight();
                    cargoDumbbells2.PrintWeight();
                cargoBarbell.AllWeight();
                    cargoBarbell.PrintWeight();
    }
}
