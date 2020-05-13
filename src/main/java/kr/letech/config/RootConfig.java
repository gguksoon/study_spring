package kr.letech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// root-context.xml -> RootConfig.java
// Spring은 Context라는 영역을 만들어서 bean들을 관리해주며, 여러 개의 Context를 가질 수 있고,
// servlet-context 다음 root-context라는 계층형 구조를 가지고 있다.
// 계층 구조상 root-context는 servlet-context 인스턴스에서 공유해야 하는 데이터 저장소 및
// 비즈니스 서비스와 같은 인프라 Bean을 등록하게 된다.
// 쉽게 말해 datasources와 같이 공통 사용 빈 또는 설정할 때 사용한다.
// 참고: https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc

// @Configuration: 해당 클래스를 설정 클래스라고 알려주는 어노테이션
// @ComponentScan: 기존 xml에 사용하던 것과 동일하게 @Component로 선언된 클래스들을 Bean으로 인식해
//                 Context 영역에 객체를 생성하도록 해주는 어노테이션 설정
@Configuration
@ComponentScan(basePackages = "kr.letech")
public class RootConfig {

}
