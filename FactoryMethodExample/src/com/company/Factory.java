package com.company;

public abstract class Factory {
   private Product product;

   public abstract Product factoryMethod();

   public void anOperation(){ //шаблонный метод
       product = factoryMethod();
   }
}
