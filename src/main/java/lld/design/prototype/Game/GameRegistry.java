package lld.design.prototype.Game;

import java.util.HashMap;
import java.util.Map;

// Step 6: Registry 
public class GameRegistry {
    
    private Map<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();
    
    public void addPrototype(BackgroundObjectType type, BackgroundObject object){
        this.registry.put(type, object);
    }

    public BackgroundObject getPrototype(BackgroundObjectType type){
        return this.registry.get(type);
    }

}
