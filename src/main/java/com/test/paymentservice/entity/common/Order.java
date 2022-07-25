package com.test.paymentservice.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer Id;
    private String Name;
    private Integer Qty;
    private Double Price;
}
