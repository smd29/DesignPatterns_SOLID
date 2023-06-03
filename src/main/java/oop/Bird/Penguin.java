package oop.Bird;

import oop.Bird.Interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable{
    public Penguin(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    // @Override
    // public void fly(){
    //     System.out.println("Penguin can't fly");
    // }

    @Override
    public void swim(){
        System.out.println("Penguin is Swimming");
    }
}

// Interface Segregation - only add those methods to an interface which will be implemented by client