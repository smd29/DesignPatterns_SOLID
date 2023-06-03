package oop.Bird;

import oop.Bird.Interfaces.Flyable;
import oop.Bird.Interfaces.Swimmable;

public class Dove extends Bird implements Swimmable, Flyable{
    public Dove(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly(){
        System.out.println("Dove is flying");
    }

    @Override
    public void swim(){
        System.out.println("Dove is Swimming");
    }


}