package com.company;

import java.util.LinkedList;
import java.util.Random;

public class List {
    static Node last;
    static Node first;

   public static void Add(int element){
       Node newNode = new Node(element);
       if(first == null){
           first = newNode;
           last = newNode;
           newNode.next=null;
       }else{
            newNode.next = last;
            last = newNode;
       }
   }

   public static void Remove() {
           Node remove = null;
           if (last.next != null) {
               remove = last;
               last = last.next;
           }
           remove.next = null;
       }


    public static void Count(){
        int count = 0;
        Node _last = last;
        while (_last != null) {
            _last = _last.next;
            count++;
        }
        System.out.println("ОБЩЕЕ КОЛИЧЕСТВО ЯЧЕЕК ! =" + " " + count);
    }

   public static void Print(){
       Node _last = last;
        while(_last != null){
            System.out.println(_last.element);
            _last = _last.next;
        }
   }


}
