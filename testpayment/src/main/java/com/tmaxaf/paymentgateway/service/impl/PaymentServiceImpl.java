package com.tmaxaf.paymentgateway.service.impl;


import com.tmaxaf.paymentgateway.dao.PaymentHistoryRepository;
import com.tmaxaf.paymentgateway.dao.entity.PaymentEntity;
import com.tmaxaf.paymentgateway.dto.*;
import com.tmaxaf.paymentgateway.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final PaymentHistoryRepository paymentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PaymentServiceImpl(PaymentHistoryRepository repository, ModelMapper mapper) {
        this.modelMapper = mapper;
        this.paymentRepository = repository;
    }
    @Override
    @Transactional
    public PaymentDTO enrollPayment(PaymentDTO payment) throws Exception {
        PaymentEntity entity = new PaymentEntity();
        modelMapper.map(payment,entity);
        paymentRepository.save(entity);
        Thread.sleep(5000);
        return payment;
    }

    @Override
    @Transactional
    public AuthorizationDTO createAuthToken(AuthTokenRequestDTO authTokenRequestDTO) throws Exception {
        Thread.sleep(2000);
        String authTokenUUID = UUID.randomUUID().toString().replace("-","");
        String tempMarketId = "TESTMID";
        AuthorizationDTO authDTO = new AuthorizationDTO();
        authDTO.setAuthToken(authTokenUUID);
        authDTO.setResultMsg("Success authorize card");
        authDTO.setMid(tempMarketId);
        authDTO.setOrderNumber("test-order-number");
        authDTO.setResultCode("0000");//  0000 : 성공 코드
        return authDTO;
    }

    @Override
    @Transactional
    public ApprovalResultDTO approvalPayment(ApprovalRequestDTO approvalRequestDTO) throws Exception {
        Thread.sleep(6000);
        String lUUID = String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16));
        ApprovalResultDTO resultDto = new ApprovalResultDTO();
        resultDto.setResultCode("0000");
        resultDto.setResultMsg("Approval payment with token " + approvalRequestDTO.getAuthToken());
        resultDto.setTid(approvalRequestDTO.getOid());
        resultDto.setApplNum(lUUID.substring(7));
        resultDto.setPayMethod("card");
        long nowMilliseconds = System.currentTimeMillis();
        Date resultDate = new Date(nowMilliseconds);
        resultDto.setApplDateTime(resultDate);
        return resultDto;
    }

    @Override
    public CancelResponseDTO cancelPayment(CancelRequestDTO cancelRequestDTO) throws Exception {
        Thread.sleep(5000);
        return null;
    }

    @Override
    public ApprovalRequestDTO getPaymentObject(String oid) throws Exception {
        return null;
    }


}
