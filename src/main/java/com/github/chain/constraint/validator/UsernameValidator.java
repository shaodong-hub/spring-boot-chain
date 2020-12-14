package com.github.chain.constraint.validator;

import com.github.chain.constraint.Username;
import com.github.chain.service.UsernameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author 石少东
 * @date 2020-10-12 15:29
 * @since 1.0
 */

@Slf4j
@RequiredArgsConstructor
public class UsernameValidator implements ConstraintValidator<Username, String> {

    private final UsernameService service;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        log.info("参数校验 - UsernameValidator");
        return service.username(value);
    }
}
