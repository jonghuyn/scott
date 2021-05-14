package com.tmaxaf.paymentgateway.dao.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;



@Data
@Entity
@Table(name = "paymentobject")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="system-uuid")
    @GenericGenerator(name = "system-uuid", strategy="uuid")
    @Column(name = "ID")
    private String id;

    @Column(name = "AUTHTOKEN")
    private String authToken;

    @Column(name = "PRICE")
    private String price;

    @Column(name = "ORDERID")
    private String orderId;

    @Column(name= "TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    // payment object 상태


}
