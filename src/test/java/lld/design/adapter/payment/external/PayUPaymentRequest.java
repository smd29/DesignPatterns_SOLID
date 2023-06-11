package lld.design.adapter.payment.external;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class PayUPaymentRequest {
    private Double amount;
    private String name;
    private String email;
}
