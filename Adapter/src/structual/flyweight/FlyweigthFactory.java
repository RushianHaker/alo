package structual.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweigthFactory {
    private Map<String,Flyweigth> pool = null;

    public FlyweigthFactory(){
        this.pool = new HashMap<>();
        this.pool.put("1", new ConcreateFlyweigth());
        this.pool.put("10", new ConcreateFlyweigth());
        this.pool.put("353674574678434563635734537456", new ConcreateFlyweigth());
    }

    public Flyweigth getFlyweigth(String key){
        if(!pool.containsKey(key))
            this.pool.put(key, new ConcreateFlyweigth());
        return this.pool.get(key);
    }
}
