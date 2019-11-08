package cn.enjoy.annotation;

import java.lang.annotation.*;

/**
 * @author: cx
 * @date : 2019/10/10 11:37
 * @description:
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CxAuthor {
    String name() default "cx";
}
