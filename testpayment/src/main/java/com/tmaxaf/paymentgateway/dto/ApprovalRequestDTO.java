package com.tmaxaf.paymentgateway.dto;

import lombok.Data;

@Data
public class ApprovalRequestDTO {

    private String oid; // 주문 id

    private String authToken;

    private String price;
}
