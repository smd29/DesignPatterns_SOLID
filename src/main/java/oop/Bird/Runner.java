package oop.Bird;

import oop.Bird.Interfaces.Flyable;
import oop.Bird.Interfaces.Swimmable;

public class Runner {
    public static void main(String[] args){
        // Bird sparrow = Bird.sparrow("beakType", 100.0); //using static initializer
        Flyable sparrow = new Sparrow(100, "Red", "small", "bT", BirdType.Sparrow);
        sparrow.fly();

         Swimmable penguin = new Penguin(100, "Black", "Big", "Ok", BirdType.Penguin);
         penguin.swim();

         Flyable flyableDove = new Dove(20, "Sada", "small", "none", BirdType.Dove);
         Swimmable swimmableDove = new Dove(20, "Sada", "small", "none", BirdType.Dove);
        //  Flyable flyableDove
        flyableDove.fly();
        swimmableDove.swim();
    }
}
