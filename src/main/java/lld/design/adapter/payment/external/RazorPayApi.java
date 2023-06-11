package lld.design.adapter.payment.external;

public class RazorPayApi {
    
    public String generateLink(){
        return "Link";
    }

    // public String makePayment(Double amount, String email){
    //     System.out.println("Make payement");
    //     return "id";
    // }
    
    public String prePay(double amount, String email){
        System.out.println("Pre Payment!!");
        return "id";
    }
        
    public void postpay(String id){
        System.out.println("Post payment");
    }
    
    public RazorpayPaymentStatus checkStatus(String payementId){
        return RazorpayPaymentStatus.SUCCESS;
    }
}
