package pri.working.boring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import pri.working.boring.mybatisPlugin.queryInfo;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PageAspect.java
 * @Description 分页aop
 * @createTime 2020年09月28日 15:55:00
 */
@Aspect
@Component
@Lazy(false)
public class PageAspect {

    @Pointcut("@annotation(pri.working.boring.annotation.PageAnnotation)")
    private void cutMethod() {

    }

    @Before("cutMethod()")
    public void begin() {
        System.out.println("===================================================================================");
    }
}
