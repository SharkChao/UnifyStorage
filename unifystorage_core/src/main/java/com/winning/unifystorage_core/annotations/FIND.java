package com.winning.unifystorage_core.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Documented
@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FIND {
    String orderBy() default "";
    String where() default "";
    String groupBy() default "";
    int limit() default 0;
    int offset() default 0;
    boolean eager() default true;
}
