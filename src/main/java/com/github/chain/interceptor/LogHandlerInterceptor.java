package com.github.chain.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 石少东
 * @date 2020-10-13 14:55
 * @since 1.0
 */

@Slf4j
@Component
public class LogHandlerInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private ObjectMapper objectMapper;

    @Override
    public boolean preHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
//        byte[] bytes = ((ContentCachingRequestWrapper) request).getRequestBodyBytes();
//        DataDTO data = objectMapper.readValue(bytes, DataDTO.class);
        System.out.println("LogHandlerInterceptor - preHandle");
//        throw new ChainException("12");
        return true;

    }

    @Override
    public void postHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        System.out.println("LogHandlerInterceptor - postHandle");
    }

    @Override
    public void afterCompletion(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
        System.out.println("LogHandlerInterceptor - afterCompletion");
    }
}
