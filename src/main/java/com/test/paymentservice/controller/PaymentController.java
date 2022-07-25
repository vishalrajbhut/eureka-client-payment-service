package com.test.paymentservice.controller;

import com.test.paymentservice.entity.Payment;
import com.test.paymentservice.entity.common.TransactionRequestResponse;
import com.test.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService service;

    @PostMapping("/doPayment/")
    public TransactionRequestResponse doPayment(@RequestBody TransactionRequestResponse request){
        return service.doPayment(request);
    }

    @GetMapping("/paymentDetails/{orderId}")
    public Optional<Payment> paymentDetails(@PathVariable Integer orderId){
        return service.getPaymentDetails(orderId);
    }
}
