package lld.design.adapter.payment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lld.design.adapter.payment.external.PaymentProvider;
import lld.design.adapter.payment.external.PaymentRequest;
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

    @Test
    public void testPayment(){
        PaymentRequest request = PaymentRequest.builder()
        .amount(100.0)
        .email("abc@email.com")
        .name("ABC")
        .build();

        String id = provider.pay(request);
        assertEquals("If pay is called, id should be returned", "id", id);
    }
}
