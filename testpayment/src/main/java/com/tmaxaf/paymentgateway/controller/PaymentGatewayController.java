package com.tmaxaf.paymentgateway.controller;
import com.tmaxaf.paymentgateway.dto.*;
import com.tmaxaf.paymentgateway.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// Naver Pay 에서 수행하는 PG에 초점을 맞추서 API 설계
@RestController
public class PaymentGatewayController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentGatewayController (PaymentService service){
        this.paymentService = service;
    }


    // payment 객체 만들기
    @PostMapping(value = "/paymentgateway/~/payment")
    public PaymentDTO enrollPayment(@RequestBody PaymentDTO payment) throws Exception{
        System.out.println("test Mapping Function");
        System.out.println(payment.getPrice());
        paymentService.enrollPayment(payment);
        return payment;
    }
    // 결제 요청

    // EX) KG 이니시스 결제창 호출 및 비빌번호 인증을 대체 --- 원천사 인증 (카드 인증 및 카드 비밀번호 인증)
    // 원래는 카드번호와 같은 개인정보를 허가된 PG사 말고는 받을 수 없다.
    // 승인 요청을 하기 전 카드 인증 요청을 수행해서 토큰을 받는곳
    @PostMapping(value = "/paymentgateway/validate/card")
    public AuthorizationDTO validateCard(@RequestBody AuthTokenRequestDTO authTokenRequestDTO)throws Exception{
        return paymentService.createAuthToken(authTokenRequestDTO);
    }


    @PostMapping(value= "paymentgateway/approval")
    public ApprovalResultDTO requestApproval(@RequestBody ApprovalRequestDTO approvalRequestDTO)throws Exception{
        return paymentService.approvalPayment(approvalRequestDTO);
    }

    @GetMapping (value="/paymentgateway/tokens")
    public String getTokens() throws Exception{
        return null;
    }
}
