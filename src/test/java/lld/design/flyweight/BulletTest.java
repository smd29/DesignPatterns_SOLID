package lld.design.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BulletTest {
    
    @Test
    public void testFlyweight(){
        // Create flyweight object
        Bullet bullet = new Bullet(BulletType.BULLET_45MM, new byte[100], 100.0, "Grey");
        FlyingBullet flyingBullet = FlyingBullet.builder().x(100.0).y(200.0).bullet(bullet).build();
        FlyingBullet flyingBullet2 = FlyingBullet.builder().x(100.0).y(200.0).bullet(bullet).build();

        assertEquals("If flyweight is used, bullet reference should be same", flyingBullet.getBullet(), flyingBullet2.getBullet());
    }
}
