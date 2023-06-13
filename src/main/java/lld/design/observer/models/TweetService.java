package lld.design.observer.models;

import lld.design.observer.interfaces.Observer;

public class TweetService implements Observer{
    
    public void update(){
        System.out.println("Sending tweet");
    }
}
