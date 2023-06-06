package lld.design.factory.Game;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lld.design.prototype.Game.BackgroundObject;
import lld.design.prototype.Game.BackgroundObjectType;
import lld.design.prototype.Game.GraphicalObject;

public class GameFactoryTest {
    
    @Test
    public void testSimpleFactoryMethod(){
        GraphicalObject background = GameFactory.createInstance(BackgroundObjectType.BACK_GROUND);

        assertNotNull("If factory is called, object shouldn't be null", background);
        assertTrue("If factory is called, object should be of background type", background instanceof BackgroundObject);
    }
}
