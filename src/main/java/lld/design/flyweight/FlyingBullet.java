package lld.design.flyweight;

import lombok.AllArgsConstructor;
import lombok.Builder;

// Step 2 - Extrinsic state(that change)
@AllArgsConstructor
@Builder
public class FlyingBullet {
    private Double x;
    private Double y;
    private Double z;
    private Double velocity;
    private Double angle;
    
    // Step 3- Add reference to flyweight
    private Bullet bullet;

    public Object getBullet() {
        return null;
    }
}
