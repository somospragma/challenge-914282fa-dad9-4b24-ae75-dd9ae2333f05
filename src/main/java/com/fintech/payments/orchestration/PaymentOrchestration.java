package com.fintech.payments.orchestration;

import com.fintech.payments.services.PaymentService;
import com.fintech.payments.dto.PaymentRequest;
import com.fintech.payments.dto.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class PaymentOrchestration {

    @Autowired
    private PaymentService paymentService;

    public Mono<PaymentResponse> orchestratePayment(PaymentRequest request) {
        return paymentService.processPayment(request);
    }
}