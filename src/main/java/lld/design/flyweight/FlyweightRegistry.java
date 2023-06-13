package lld.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistry<TYPE, OBJECT_TYPE> {
    
    private Map<TYPE, OBJECT_TYPE> registry = new HashMap<>();

    public void add(TYPE bulletType, OBJECT_TYPE bullet){
        registry.put(bulletType, bullet);
    }

    public OBJECT_TYPE get(TYPE bulletType){
        return registry.get(bulletType);
    }
}
