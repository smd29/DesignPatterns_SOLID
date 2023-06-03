package oop.Bird;

import oop.Bird.Interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("\nSparrow is flying");
        new GlidingBehavior().makeFly();
    }
    
}