package com.fintech.payments;

import com.fintech.payments.dto.PaymentRequest;
import com.fintech.payments.dto.PaymentResponse;
import com.fintech.payments.services.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void testProcessPayment() {
        PaymentRequest request = new PaymentRequest("123", 100.0);
        Mono<PaymentResponse> response = paymentService.processPayment(request);
        response.subscribe(res -> assertEquals("123", res.getTransactionId()));
    }
}