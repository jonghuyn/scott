# Tmax Payment System Guide

> Tmax Payment 시스템 문서 작성을 위한 프로젝트입니다.

> 가이드는 [VuePress](https://vuepress.vuejs.org/) 을 기반하고 있으며, `Markdown` 으로 가이드를 작성합니다.  
> 작성에 대한 규칙이나 방법은 (https://vuepress.vuejs.org/guide/) 을 통해 참고할 수 있습니다.

## Payment Service API

### Order Service API

주문 서비스는 App에서 요청을 받는 Front Service로 Order Service로 부터 결제 완료때까지 주문 번호를 생성하고 backend service들을 호출하게 된다.

### Request From Client
|Field Name|Description|Type|Required|  
|:--:|:--|:--|:--|  
|**cid** |가맹점 코드 | string  | O |
|**patner_user_id** |가맹점 회원 id | string  | O |
|**Patner_order_id** |가맹점 주문번호 | string  | O |
|**item_name** |상품명 | string  | O |
|**item_code** |상품코드 | string  | O |
|**quantity** |상품 수량 | string  | O |
|**total_amount** |상품 총액 | string  | O |
|**tax_amount** |상품 비과세 금액 | string  | O |
|**vat_amount** |상품 부가세 금액 | string  | X |
|**avaliable_cards** |결제 수단으로 허용할 카드사 지정 (기본값 : 모든 카드사 허용) | string  | X |
|**payment_method_type** |사용 허가할 결제 수단 | string  | X |
|**install_month** |카드 할부개월| string  | X |
|**custom_json** | 가맹점과 사전 협의하여 보내는 JSON Data | JSON Map {String : String}  | X |

### Response From Server
|Field Name | Description | Type |
|:--:|:--|:--|
|**tid** |가맹점 코드 | string  |
|**next_redirect_mobile_web_url** |요청한 클라이언트가 모바일 웹일 경우 | string  |
|**next_redirect_mobile_web_url** |요청한 클라이언트가 웹일 경우 | string  |
|**created_at** |결제 준비 요청 시간 | string  |

#### Sample (Postman)
실제 Rest API 요청할 때의 예시


## 결제 승인 요청 API
Client에서 Redirect한 Page에서 결제 비밀번호를 입력하고 나면 결제 승인 API 호출한다.




