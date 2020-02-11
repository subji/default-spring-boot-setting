Spring Boot Default Settings
= 
> ## **Spring Security**
> - 초기 세팅 DB 없이 application.yml 으로 참조
---
> ## **Spring JPA**
> - Hibernate 설정 추가
---
> ## **Spring Boot Admin**
> - Acquator 설정 추가
> - 어플리케이션 이름 설정
---
> ## **Logging**
> - 프로필 별 로그파일 이름 설정
> - Working Directory 밑에 log 폴더 아래에 로그파일 생성
> - log4jdbc.log4j2.properties 파일로 jdbc 에 관한 로깅 설정
---
> ## **Profiles**
> - DEV / PROD 버전 설정 파일 분리
---
> ## **View**
> - JSP 사용
> - 필요시 Thymeleaf 또는 별도의 프론트 프레임워크 개발
---
> ## **Package Structure**
> - com / Group Id / Project Name
> - Package By Feature (O)
>   - **Example** 
>     - com.group.proj.***module.domain***
>     - com.group.proj.***module.service***
>     - com.group.proj.***module.dao***
>     - com.group.proj.***module.web***
> - Package By Layer (X)
>   - **Example** 
>     - com.group.proj.***domain.module***
>     - com.group.proj.***service.module***
>     - com.group.proj.***dao.module***
>     - com.group.proj.***web.module***
> - <U>[두가지 패키지구조의 설명 및 추천 패키지 구조 설명](http://www.javapractices.com/topic/TopicAction.do?Id=205){: target="_blank"}</U>
