package com.test.paymentservice.service;

import com.test.paymentservice.entity.Payment;
import com.test.paymentservice.entity.common.TransactionRequestResponse;
import com.test.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public TransactionRequestResponse doPayment(TransactionRequestResponse reqRes) {
        try {
            Payment payment = new Payment();
            payment.setPrice(reqRes.getOrder().getPrice());
            payment.setPaymentStatus(paymentProcessing());
            payment.setOrderId(reqRes.getOrder().getId());
            Payment pt = repository.save(payment);
            reqRes.setPayment(pt);
            return reqRes;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    private String paymentProcessing(){
        return new Random().nextBoolean() ? "Transaction Successful" : "Transaction Failure";
    }

    public Optional<Payment> getPaymentDetails(Integer orderId) {
        return repository.findByOrderId(orderId);

    }
}
