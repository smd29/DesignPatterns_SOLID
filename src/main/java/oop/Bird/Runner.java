package oop.Bird;

public class Runner {
    public static void main(String[] args){
        // Bird sparrow = Bird.sparrow("beakType", 100.0); //using static initializer
        Bird sparrow = new Sparrow("beakType", 100.0);
        sparrow.fly();

        Bird parrot = new Parrot("beakType", 200.0);
        parrot.fly();

    }
}
