package com.github.chain.interceptor;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author 石少东
 * @date 2020-10-13 18:47
 * @since 1.0
 */


@Component
public class LogWebMvcConfigurer implements WebMvcConfigurer {

    @Resource
    private Map<String, HandlerInterceptorAdapter> interceptors;

    @Override
    public void addInterceptors(@NotNull InterceptorRegistry registry) {
        interceptors.values().forEach(one -> registry.addInterceptor(one).addPathPatterns("/**"));
    }
}
