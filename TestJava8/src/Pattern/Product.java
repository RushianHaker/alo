package Pattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> list = new ArrayList<>();

    public void add(String part) {
        list.add(part);
    }

    public void show() {
        list.forEach(System.out::println);
    }
}
