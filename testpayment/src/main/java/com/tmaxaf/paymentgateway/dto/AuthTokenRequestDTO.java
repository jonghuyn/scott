package com.tmaxaf.paymentgateway.dto;

import lombok.Data;


// 페이 시스템이 인증하는 것이 아닌 다른 원천 카드사가 인증하는 요청 DTO이다.
@Data
public class AuthTokenRequestDTO {
    private String cardNumber;

    private String validityMonth;

    private String validityYear;

    private String twoDigitPassword;
}
