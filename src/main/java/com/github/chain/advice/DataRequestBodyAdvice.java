package com.github.chain.advice;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author 石少东
 * @date 2020-10-14 14:35
 * @since 1.0
 */


@Slf4j
@RestControllerAdvice
public class DataRequestBodyAdvice implements RequestBodyAdvice {

    @Override
    public boolean supports(@NotNull MethodParameter methodParameter, @NotNull Type type, @NotNull Class<? extends HttpMessageConverter<?>> aClass) {
        System.out.println("DataRequestBodyAdvice");
        return false;
    }

    @Override
    public HttpInputMessage beforeBodyRead(@NotNull HttpInputMessage httpInputMessage, @NotNull MethodParameter methodParameter, @NotNull Type type, @NotNull Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        return null;
    }

    @Override
    public Object afterBodyRead(@NotNull Object o, @NotNull HttpInputMessage httpInputMessage, @NotNull MethodParameter methodParameter, @NotNull Type type, @NotNull Class<? extends HttpMessageConverter<?>> aClass) {
        return null;
    }

    @Override
    public Object handleEmptyBody(Object o, @NotNull HttpInputMessage httpInputMessage, @NotNull MethodParameter methodParameter, @NotNull Type type, @NotNull Class<? extends HttpMessageConverter<?>> aClass) {
        return null;
    }
}
