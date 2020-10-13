package Pattern;

public class ConcreateBuilder extends Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("PartA");
    }

    @Override
    public void buildPartB() {
        product.add("PartB");
    }

    @Override
    public void buildPartC() {
        product.add("PartC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
