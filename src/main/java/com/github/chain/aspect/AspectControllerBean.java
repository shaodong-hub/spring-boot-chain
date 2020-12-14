package com.github.chain.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 石少东
 * @date 2020-10-12 15:23
 * @since 1.0
 */


@Slf4j
@Aspect
@Component
public class AspectControllerBean {

    @Pointcut("execution(public * com.github.chain.controller.IndexController.index(*)) && @annotation(post)")
    public void index(PostMapping post) {
    }

    @Around(value = "index(post)")
    public Object logAround(ProceedingJoinPoint pjp, PostMapping post) throws Throwable {
        log.info("aop");
        return pjp.proceed();
    }

}
