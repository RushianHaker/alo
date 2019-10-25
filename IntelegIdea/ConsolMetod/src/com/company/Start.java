package com.company;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Start {

    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Store store1 = new Store();
    ScanerInfo info = new ScanerInfo();

    public void call() throws IOException {
        System.out.println("-|New product (1)|-|Sale Report (2)|-|Purchase (3)|-|Quit (4)|-" + '\n' + "Введите запрос:");

        String method = reader.readLine();
        switch (method) {
            case "1":
                store1.newProduct(new Phone(info.setModel(), info.setColor(), info.setPrice(), info.setNumder()));
                break;
            case "2":
                store1.saleReport();
                break;
            case "3":
                store1.purchase();
                break;
            case "4":
                break;
        }
    }
}

