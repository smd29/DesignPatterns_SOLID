package lld.design.adapter.payment.external;

// Step 2: Another concrete class for PayU
public class PayUPaymentProvider implements PaymentProvider{

    private PayUApi api = new PayUApi();
    
    @Override
    public String link() {
        return api.makeLink();
    }

    @Override
    public String pay(PaymentRequest request) {
        return api.createPayment(toRequest(request));
    }
    

    private PayUPaymentRequest toRequest(PaymentRequest request) {
        return PayUPaymentRequest.builder()
        .amount(request.getAmount())
        .email(request.getEmail())
        .name(request.getName()).build();
    }

    @Override
    public PaymentStatus status(String payementId) {
        return toPayementStatus(api.getStatus(payementId));
    }

    private PaymentStatus toPayementStatus(PayUPaymentStatus status) {
        if (status == PayUPaymentStatus.FAILED){
            return PaymentStatus.ERROR;
        }
        return PaymentStatus.OKAY;
    }   
    
}
