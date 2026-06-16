package com.fintech.payments.clients;

import com.fintech.payments.dto.PaymentRequest;
import com.fintech.payments.dto.PaymentResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ExternalServiceClient {

    public Mono<PaymentResponse> callExternalService(PaymentRequest request) {
        // Simulate external service call
        return Mono.just(new PaymentResponse(request.getTransactionId(), request.getAmount()));
    }
}