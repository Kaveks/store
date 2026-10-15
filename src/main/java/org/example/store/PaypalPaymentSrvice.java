package org.example.store;

import org.springframework.stereotype.Service;

//@Service
public class PaypalPaymentSrvice implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("""
                                                                     \s
                                    PAYPAL,
                                    Amount \
                                   \s""" + amount);
    }
}
