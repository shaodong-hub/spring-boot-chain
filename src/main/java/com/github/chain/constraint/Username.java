package com.github.chain.constraint;

import com.github.chain.constraint.validator.UsernameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 石少东
 * @date 2020-10-12 15:29
 * @since 1.0
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = UsernameValidator.class)
public @interface Username {

    String value() default "";

    String message() default "Username";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
