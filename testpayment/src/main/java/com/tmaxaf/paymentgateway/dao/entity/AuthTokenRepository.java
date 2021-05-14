package com.tmaxaf.paymentgateway.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthTokenRepository extends JpaRepository<PaymentEntity, Integer> {
}
