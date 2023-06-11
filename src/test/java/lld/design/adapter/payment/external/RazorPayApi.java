package lld.design.adapter.payment.external;

public class RazorPayApi {
    
    public String generateLink(){
        return "Link";
    }

    public String makePayment(Double amount, String email){
        System.out.println("Make payement");
        return "id";
    }

    public RazorpayPaymentStatus checkStatus(String payementId){
        return RazorpayPaymentStatus.SUCCESS;
    }
}
