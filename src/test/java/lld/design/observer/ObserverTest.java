package lld.design.observer;

import org.junit.Before;
import org.junit.Test;

import lld.design.observer.interfaces.BitcoinManager;
import lld.design.observer.interfaces.Observabale;
import lld.design.observer.models.EmailService;
import lld.design.observer.models.InMemoryBitcoinManager;
import lld.design.observer.models.TweetService;

public class ObserverTest {
    
    Observabale observabale;

    @Before
    public void setUp(){
        observabale = new InMemoryBitcoinManager();
        observabale.register(new EmailService());
        observabale.register(new TweetService());
    }

    @Test
    public void testObserver(){
        ((BitcoinManager) observabale).setPrice(100.0);
    }

    public static void main(String[] args){
        Observabale observabale = new InMemoryBitcoinManager();
        observabale.register(new EmailService());
        observabale.register(new TweetService());
        ((BitcoinManager) observabale).setPrice(100.0);
    }
}
