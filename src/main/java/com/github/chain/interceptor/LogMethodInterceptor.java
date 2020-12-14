package com.github.chain.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 石少东
 * @date 2020-10-14 14:26
 * @since 1.0
 */


@Aspect
@Component
public class LogMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object obj = invocation.proceed();
        System.out.println(" LogMethodInterceptor ");
        return obj;
    }
}
