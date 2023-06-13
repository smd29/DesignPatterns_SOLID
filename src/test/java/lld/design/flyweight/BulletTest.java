package lld.design.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lld.design.prototype.Game.BackgroundObjectType;
import lld.design.prototype.Game.GraphicalObject;

public class BulletTest {
    
    FlyweightRegistry<BulletType, Bullet> flyweightRegistry;

    @Before
    public void setUp(){
        flyweightRegistry = new FlyweightRegistry<>();
    }

    @Test
    public void testFlyweight(){
        // Create flyweight object
        Bullet bullet = new Bullet(BulletType.BULLET_45MM, new byte[100], 100.0, "Grey");
        FlyingBullet flyingBullet = FlyingBullet.builder().x(100.0).y(200.0).bullet(bullet).build();
        FlyingBullet flyingBullet2 = FlyingBullet.builder().x(100.0).y(200.0).bullet(bullet).build();

        assertEquals("If flyweight is used, bullet reference should be same", flyingBullet.getBullet(), flyingBullet2.getBullet());
    }

    @Test
    public void registry(){
        Bullet bullet = new Bullet(BulletType.BULLET_45MM, new byte[100], 100.0, "Grey");
        flyweightRegistry.add(BulletType.BULLET_45MM, bullet);
        FlyingBullet flyingBullet = FlyingBullet.builder()
                                    .angle(200.0).bullet(bullet)
                                    .build();
        Bullet bullet2 = flyweightRegistry.get(BulletType.BULLET_45MM);
        FlyingBullet flyingBullet2 = FlyingBullet.builder()
                                    .angle(200.0).bullet(bullet2)
                                    .build();
    }
}
