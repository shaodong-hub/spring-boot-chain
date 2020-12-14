package com.github.chain.exception.handler;

import com.github.chain.exception.ChainException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 石少东
 * @date 2020-10-23 11:09
 * @since 1.0
 */


@RestControllerAdvice
public class ChainExceptionHandler {

    @ExceptionHandler(ChainException.class)
    public String chainExceptionHandler() {
        System.out.println("ChainExceptionHandler");
        return "chainExceptionHandler";
    }

}
