package lld.design.adapter.payment.external;

public class PayUApi {
    
    public String makeLink(){
        return "Link";
    }

    public String createPayment(PayUPaymentRequest request){
        System.out.println("Make payement");
        return "id";
    }

    public PayUPaymentStatus getStatus(String payementId){
        return PayUPaymentStatus.OK;
    }
}
