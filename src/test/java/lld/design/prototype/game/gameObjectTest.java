package lld.design.prototype.game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import lld.design.prototype.Game.BackgroundObject;
import lld.design.prototype.Game.BackgroundObjectType;
import lld.design.prototype.Game.GameRegistry;
import lld.design.prototype.Game.GraphicalObject;

public class gameObjectTest {
    
    private GameRegistry registry= new GameRegistry();
    @Test
    public void testClone(){
        // Step 4: Create a prototype
        BackgroundObject prototype = new BackgroundObject(10, 12, 15, BackgroundObjectType.FORE_GROUND);
        BackgroundObject clone = prototype.clone();

        assertNotNull("If prototype is called, clone shouldn't be null", clone);
        assertEquals("IF clone is called, height should be same as prototype", Integer.valueOf(10), clone.getHeight());

        // Step 5: modify clone object

        clone.setHeight(100);
        clone.setDepth(1);
    }

    @Test
    public void testRegistry(){
        BackgroundObject prototype = new BackgroundObject(10, 12, 15, BackgroundObjectType.FORE_GROUND);
        registry.addPrototype(prototype.getType(), prototype);

        BackgroundObject clone = registry.getPrototype(BackgroundObjectType.FORE_GROUND).clone();
        
        assertNotNull("If prototype is called, clone shouldn't be null", clone);
    }
}
