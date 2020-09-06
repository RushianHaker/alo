package com.company;


//DI(Dependency Injection)
//DI(Dependency Inversion) - зависимость от интерфейса
public class Client {

    private AbstractBottle bottle;
    private AbstractCoffie coffie;
    private AbstractCover cover;

    //вязанность (low couplin) - мера зависимости одного обекта от другого
    //связность (hight cohesion) -  мера самодостаточности
    public Client (AbstractFactory factory){ //абстрактная связность

        //абстрагирование процесса инстанцирования
        this.bottle = factory.createBottle();
        this.coffie = factory.createCoffie();
        this.cover = factory.createCover();
    }

    public void run(){
        //абстрогирование вариантов использования
        bottle.interact(coffie);
        bottle.interact(cover);
    }
}
