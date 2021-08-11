package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration //설정정보
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION
                , classes = Configuration.class)
)
//@Component 어노테이션이 붙은 클래스들을 빈으로 등록함
public class AutoAppConfig {
}
