package lld.design.observer.models;

import lld.design.observer.interfaces.BitcoinManager;
import lld.design.observer.interfaces.Observabale;

public class InMemoryBitcoinManager extends Observabale implements BitcoinManager{

    private Bitcoin bitcoin = new Bitcoin(100.0);
    // private EmailService emailService;
    // private TweetService tweetService;

    @Override
    public void setPrice(Double price) {
        bitcoin.setPrice(price);
        notifyChange();
    }
    
}


// SRP + OCP violation