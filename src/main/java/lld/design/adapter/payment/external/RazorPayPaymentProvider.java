package lld.design.adapter.payment.external;

// Step 2: Create concreate adaptee classes
public class RazorPayPaymentProvider implements PaymentProvider{

    private RazorPayApi api = new RazorPayApi();

    @Override
    public String link() {
        return api.generateLink();
    }

    // @Override
    // public String pay(PaymentRequest request) {
    //     return api.makePayment(request.getAmount(), request.getEmail());
    // }

    @Override
    public String pay(PaymentRequest request){
        String id = api.prePay(request.getAmount(), request.getEmail());
        api.postpay(id);
        return id;
    }
    

    @Override
    public PaymentStatus status(String paymentId) {
        return toPaymentStatus(api.checkStatus(paymentId));
    }
    
    private PaymentStatus toPaymentStatus(RazorpayPaymentStatus cheStatus){
        if (cheStatus == RazorpayPaymentStatus.FAILURE){
            return PaymentStatus.ERROR;
        }
        return PaymentStatus.OKAY;
    }
}
