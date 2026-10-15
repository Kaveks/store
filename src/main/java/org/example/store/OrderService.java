package org.example.store;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
            paymentService.processPayment(150);

        }
    // use setter to inject dependency if its optional otherwise use constructor
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService=paymentService;
    }
}
