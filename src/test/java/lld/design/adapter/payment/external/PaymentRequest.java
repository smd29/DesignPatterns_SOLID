package lld.design.adapter.payment.external;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class PaymentRequest {

    private Double amount;
    private String email;
    private String name;
    private String phone;
}
