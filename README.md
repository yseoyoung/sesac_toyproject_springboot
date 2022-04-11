## 🐶❤ Love Pet 반려동물 쇼핑몰

### 프로젝트 소개
스프링부트와 JPA를 활용한 반려동물 쇼핑몰 웹 애플리케이션
<br>

### 개발 환경 
- IDE: IntelliJ
- JDK Version: JDK15
- Spring Boot: 2.6.3
- Data Base: MySQL
- Build Tool: Maven

### 주요기능

스프링 시큐리티를 이용한 회원가입 및 로그인, 로그아웃 기능 구현

상품 등록 및 수정 기능

상품 검색 및 페이징 기능

장바구니 추가 및 결제 기능

테스트 코드 작성
<br>

### ERD
<img width="60%" alt="ERD" src="https://user-images.githubusercontent.com/65703902/162138223-3b203c26-dc15-4640-a209-ae5f53014c12.JPG">


### 화면구성(사진캡쳐)

#### ✔메인 화면 - 로그인/카테고리
<img width="60%" alt="메인" src="https://user-images.githubusercontent.com/97068969/162135315-89d1cfae-5f49-4b27-93c2-f3929f89776f.PNG">
<br/>
<br/>
<br/>

#### ✔상품 리스트
<img width="60%" alt="상품리스트" src="https://user-images.githubusercontent.com/97068969/162135375-53e780e2-a5db-422d-8990-8ce07abe6a50.PNG">
<br/>
<br/>
<br/>

#### ✔상품 상세 페이지 - 품절시 장바구니, 주문 모두 불가
<img width="60%" alt="상세" src="https://user-images.githubusercontent.com/97068969/162142660-3a3f7066-8c04-4789-9a31-20511d685b00.PNG">
<img width="60%" alt="상세페이지" src="https://user-images.githubusercontent.com/97068969/162142369-5a8a0a46-631c-4ab0-aad8-b6e89a133067.PNG">
<br/>
<br/>
<br/>

#### ✔키워드 검색시 페이징된 해당 상품 리스트 표시
<img width="60%" alt="서치" src="https://user-images.githubusercontent.com/97068969/162136562-9bf21dcf-7e41-463a-9bda-d22e726ee4ad.PNG">
<br/>
<br/>
<br/>

#### ✔로그인과 회원가입 페이지 Spring Security
<img width="40%" alt="로그인" src="https://user-images.githubusercontent.com/97068969/162137046-4f8b42b9-0ff1-4ea9-bebf-f36b066b0411.PNG">
<img width="40%" alt="ㅎㅇㄱㅇ" src="https://user-images.githubusercontent.com/97068969/162137229-2bf62a52-8bd5-4c89-abb9-96e6bbd3ecdf.PNG">
<br/>
<br/>
<br/>

#### ✔admin 계정 로그인 후 상품 등록 페이지 - 판매중, 품절 선택 가능하며 이미지 최대 5개 업로드 가능
<img width="60%" alt="상품등록" src="https://user-images.githubusercontent.com/97068969/162140357-71faa0d2-83ed-49f8-968b-cb5be3b4e7d4.PNG">
<br/>
<br/>
<br/>

#### ✔상품 관리 페이지 내 상품 클릭 시 수정 가능 / 수정하기 클릭시 메인 페이지로 리다이렉트
<img width="60%" alt="상품관리" src="https://user-images.githubusercontent.com/97068969/162140915-cb996619-4310-41fa-95e0-6874c44f7052.PNG">
<img width="60%" alt="상품 수정" src="https://user-images.githubusercontent.com/97068969/162140926-02978132-8937-4b83-8ef5-b66111c6c516.PNG">
<br/>
<br/>
<br/>

#### ✔장바구니 페이지에서 결제 가능
<img width="60%" alt="장바구니" src="https://user-images.githubusercontent.com/97068969/162143219-af6fa2b3-832e-4181-ae18-3a1f35705026.PNG">
<br/>
<br/>
<br/>

#### ✔장바구니 페이지에서 주문시 구매이력 페이지로 리다이렉트
<img width="60%" alt="구매" src="https://user-images.githubusercontent.com/97068969/162143602-76878fa0-7596-409c-9527-94ef02bd378f.PNG">
<br/>
<br/>


### 개선점
- API 로그인, 결제 시스템 추가 필요
- 촉박한 시간으로 커뮤니티 기능 추가 실패. 추후 구현 예정
- 관리자 공지 게시판

