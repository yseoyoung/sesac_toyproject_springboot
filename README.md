## 🐶❤ Pet Love 반려동물 쇼핑몰

### 프로젝트 소개
스프링부트와 JPA를 활용한 반려동물 쇼핑몰 웹 애플리케이션


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

### ERD
<img width="60%" alt="ERD" src="https://user-images.githubusercontent.com/65703902/162138223-3b203c26-dc15-4640-a209-ae5f53014c12.JPG">

### 화면구성


### 트러블슈팅

<details>
<summary>로그인 실패 시 에러 메세지 출력 후 다시 로그인 페이지로 이동이 되지 않음</summary>
<div markdown="1">       
<br>
  
  ✔  <b>해결방법</b>
  
  ![image](https://user-images.githubusercontent.com/65703902/162134535-92ab14b9-06cc-490b-b5dc-76a26cdfda11.png)
  
기존에는 ajax 요청만 고려해서 UNAUTHORIZED 에러를 반환하도록 하였는데, ajax의 경우 request header에 XMLHttpRequest 라는 값이 세팅돼서 나옴. 그럴 경우만 UNAUTHORIZED 에러를 반환하고, 나머지 경우는 로그인 페이지로 리다이렉트 해줘야 함.

</div>
</details>

<details>
<summary>NoSuchMethodError 문제</summary>
<div markdown="1">       
<br>
  
  members/new를 실행 시

```

Cannot render error page for request [/members/new] and exception [org.thymeleaf.context.IWebContext.getExchange()Lorg/thymeleaf/web/IWebExchange;] as the response has already been committed. As a result, the response may have the wrong status code.

```

member/login 실행 시

```
Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Handler processing failed; nested exception is java.lang.NoSuchMethodError: org.thymeleaf.context.IWebContext.getExchange()Lorg/thymeleaf/web/IWebExchange;] with root cause

```
  
✔  <b>해결방법</b>
  
  버전 문제.  build.gradle에서 implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity5' 으로 implementation
  
</div>
</details>

### 개선점

- API 로그인, 결제 시스템 추가 필요
- 촉박한 시간으로 커뮤니티 기능 추가 실패. 추후 구현 예정
- 관리자 공지 게시판

