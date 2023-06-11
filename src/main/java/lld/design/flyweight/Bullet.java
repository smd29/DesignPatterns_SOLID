package lld.design.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 1: Create flyweight - intrinsic state(which doesn't change)
@AllArgsConstructor
@Getter
public class Bullet {
    private BulletType type;
    private byte[] image; 
    private Double weight;
    private String color;
}
