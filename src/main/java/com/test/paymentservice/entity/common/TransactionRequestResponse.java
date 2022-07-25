package com.test.paymentservice.entity.common;

import com.test.paymentservice.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestResponse {
    Order order;
    Payment payment;
}
