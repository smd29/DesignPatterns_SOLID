package oop.Bird;

public class Sparrow extends Bird{
    
    public Sparrow(String beakType, Double weight){
        super(beakType, weight);
    }

    @Override
    public void fly(){
        System.out.println("Sparrow flying from sparrow.java");
    }
}
