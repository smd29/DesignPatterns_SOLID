package lld.design.adapter.payment.external;


// Step 1: Create common adapter interface
public interface PaymentProvider {
    
    public String link();
    public String pay(PaymentRequest request);
    public PaymentStatus status(String payementId);
}
