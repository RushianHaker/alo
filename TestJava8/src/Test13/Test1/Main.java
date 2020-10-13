package Test13.Test1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> list = new ArrayList();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Вводите слова: ");

        boolean a = true;

        while(a){
            System.out.print("> ");
            String word = scan.nextLine().replaceAll("\\s+","");
            list.add(word);
            if(word.toLowerCase().equals("end")){
                a = false;
                list.remove(list.size() - 1);
            }
        }
        System.out.println("------------>");
        list.forEach(System.out::println);
    }
}
