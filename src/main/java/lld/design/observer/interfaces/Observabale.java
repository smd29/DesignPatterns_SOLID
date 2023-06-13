package lld.design.observer.interfaces;

import java.util.ArrayList;
import java.util.List;

// Step 2: Create interesting class wrapper
public class Observabale {
    

    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer){
        observers.add(observer);
    }

    public void deRegister(Observer observer){
        observers.remove(observer);
    }

    public void notifyChange(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
