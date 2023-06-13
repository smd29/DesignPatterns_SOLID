package lld.design.observer.models;

import lld.design.observer.interfaces.Observer;

public class EmailService implements Observer{
    
    public void update(){
        System.out.println("Sending email");
    }
}
