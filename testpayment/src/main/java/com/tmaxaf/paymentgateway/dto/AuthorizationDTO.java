package com.tmaxaf.paymentgateway.dto;

import lombok.Data;

@Data
public class AuthorizationDTO {
    private String resultCode;

    private String resultMsg;

    private String mid; // 상점 id
    
    private String authToken;

    private String orderNumber;

    private String authUrl; // 해당 URL 로 API request 승인 요청
}
