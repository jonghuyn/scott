package com.tmaxaf.paymentgateway.dto;

import lombok.Data;

import java.util.Date;


@Data
public class PaymentDTO {
    private String id;

    private String authToken;

    private String price;

    private Date timestamp;
}
