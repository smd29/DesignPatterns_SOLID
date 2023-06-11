package lld.design.adapter.payment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lld.design.adapter.payment.external.PaymentProvider;
import lld.design.adapter.payment.external.RazorPayPaymentProvider;

public class PaymentProviderTest {
    private PaymentProvider provider;

    @Before
    public void setUp(){
        provider = new RazorPayPaymentProvider();
    }

    @Test
    public void testLink(){
        String link = provider.link();
        assertEquals("If link is called, Link should be returned", "Link", link);
    }
}
