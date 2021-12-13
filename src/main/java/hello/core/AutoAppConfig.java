package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration //설정정보
@ComponentScan(
        // 탐색할 패키지의 시작 위치를 지정. 이 패키지를 포함해서 하위 패키지를 모두 탐
        basePackages = "hello.core.member",
        // 지정한 클래스의 패키지를 탐색 시작 위치로 지정한다.
        basePackageClasses = AutoAppConfig.class,
        // basePackages, basePackageClasses 둘다 지정되지 않으면 속한 패키지의 하위 패키지를 모두 탐색

        // includeFilters : 컴포넌트 스캔 대상을 추가로 지정한다.
        // excludeFilters : 컴포넌트 스캔에서 제외할 대상을 지정한다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//@Component 어노테이션이 붙은 클래스들을 빈으로 등록함
public class AutoAppConfig {
/*
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
*/

}
