package com.fintech.payments.services;

import com.fintech.payments.clients.ExternalServiceClient;
import com.fintech.payments.dto.PaymentRequest;
import com.fintech.payments.dto.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PaymentService {

    @Autowired
    private ExternalServiceClient externalServiceClient;

    public Mono<PaymentResponse> processPayment(PaymentRequest request) {
        return externalServiceClient.callExternalService(request)
               .map(response -> new PaymentResponse(response.getTransactionId(), response.getAmount()));
    }
}