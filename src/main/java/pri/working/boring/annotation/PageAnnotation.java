package pri.working.boring.annotation;

import java.lang.annotation.*;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName PageAnnotation.java
 * @Description 分页注解
 * @createTime 2020年09月28日 15:32:00
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PageAnnotation {
    int pageSize() default 20;
}
