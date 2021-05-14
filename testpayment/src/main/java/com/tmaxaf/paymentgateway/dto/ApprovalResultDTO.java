package com.tmaxaf.paymentgateway.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ApprovalResultDTO {
    private String resultCode;

    private String resultMsg;

    private String oid; // 주문 id

    private String payMethod;

    private String applNum; // 승인 번호

    private Date applDateTime;
}
