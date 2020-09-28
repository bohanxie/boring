package pri.working.boring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import pri.working.boring.annotation.PageAnnotation;
import pri.working.boring.mybatisPlugin.queryInfo;

import java.lang.reflect.Method;

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
    public void begin(JoinPoint joinPoint) throws Throwable {
        // 获取目标方法的名称
        String methodName = joinPoint.getSignature().getName();
        // 获取方法传入参数
        Object[] params = joinPoint.getArgs();

        // 反射获取目标类
        Class<?> targetClass = joinPoint.getTarget().getClass();

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        // 拿到方法对应的参数类型
        Class<?>[] parameterTypes = methodSignature.getParameterTypes();
        // 根据类、方法、参数类型（重载）获取到方法的具体信息
        Method objMethod = targetClass.getMethod(methodName, parameterTypes);
        // 拿到方法定义的注解信息
        PageAnnotation annotation = methodSignature.getMethod().getAnnotation(PageAnnotation.class);


        // 模拟进行验证
        System.out.println("===================================================================================" + annotation.pageSize());
    }
}
