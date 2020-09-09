package com.company;

public class Main {

    public static void main(String[] args) {
	Builder builder = new ConcreteBuilder();
	Directro director = new Directro(builder);

	director.construct();

	Product product = builder.getResult();
	product.show();
    }
}
