package oop.Bird;

public class Parrot extends Bird{
    
    public Parrot(String beakType, Double weight){
        super(beakType, weight);
    }

    @Override
    public void fly(){
        System.out.println("Parrot flying from parrot.java");
    }
}
