---
title: Order Service
prev: '../'
sidebar: true
---

## Order Service Detail

Order Service는 Pay를 수행하기 전에 가맹점 정보, 사용자 정보, 상품 정보를 토대로 주문 번호를 발급하고 Order State를 관리를 하는 Service이다.

|Title|Description|  
|:--:|:--|  
|**Service Name** |Order Service |  
|**Input Value** | 가맹점 코드, 가맹점 코드 인증키, 가맹점 회원 id, 상품명, 상품코드, 상품수량, 상품총액, 상품비과세 금액, 상품 부가세 금액, 결제 수단으로 허용할 카드, 카드 할부 개월, 결제 화면에 보여줄 사용자 정의 문구 (Pay System 관리자와 사전 협의 필요) |  
|**From Service**| Risk Detecting Service, Payment Profile Service, Payment Auth Service (결제 결과 반환)|  
|**Service Scenario**| 서비스를 수행하는 시나리오<br />1. 주문생성 요청을 App에서 받음 <br />2. Risk Service에 해당 주문에 대한 위험성을 판단.<br /> 2-1.<br /> 2-1-a. 주문을 요청한 가맹점과 사용자에 대한 인증을 User Auth Service에 요청 <br /> 2-1-b. 회원 인증 과정 또는 제로섬 Fail일 경우 Order Service에서 바로 App으로 이상거래 위험성을 알리는 Response<br /> 2-2. 구매자가 결제 방법을 정하면 인증을 요청하는 Payment Auth Service 호출<br />3. 결제 인증 요청 결과를 처음 요청 온 App에게 Response|  
|**Result**| 결제 결과 및 주문상태에 대한 실시간 Update |  
|**To**| Front Service로 요청한 Application |  
|**Related Service**| Risk Detecting Service, Payment Profile Service, Payment Auth Service|

# Order Servie Database

Order Service는 주문을 기록하고 해당 주문의 상태를 관리하는 Service이다. 따라서 event에 따라 Database의 주문 record를 변경해야하며 Database에 분류를 하도록 한다.





