package lld.design.adapter.payment;

import org.junit.Before;

import lld.design.adapter.payment.external.PaymentProvider;
import lld.design.adapter.payment.external.RazorPayPaymentProvider;

public class PaymentProviderTest {
    private PaymentProvider provider;

    @Before
    public void setUp(){
        provider = new RazorPayPaymentProvider();
    }
}
