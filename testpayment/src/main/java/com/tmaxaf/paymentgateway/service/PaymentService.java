package com.tmaxaf.paymentgateway.service;


import com.tmaxaf.paymentgateway.dto.*;

public interface PaymentService {

    PaymentDTO enrollPayment(PaymentDTO payment) throws Exception;

    AuthorizationDTO createAuthToken(AuthTokenRequestDTO authTokenRequestDTO) throws Exception;

    ApprovalResultDTO approvalPayment(ApprovalRequestDTO approvalRequestDTO) throws Exception;

    CancelResponseDTO cancelPayment(CancelRequestDTO cancelRequestDTO) throws Exception;

    ApprovalRequestDTO getPaymentObject (String oid) throws Exception;
}
