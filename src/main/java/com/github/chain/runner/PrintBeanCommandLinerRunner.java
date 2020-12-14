package com.github.chain.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 石少东
 * @date 2020-10-29 23:30
 * @since 1.0
 */


@Component
public class PrintBeanCommandLinerRunner implements CommandLineRunner {

    @Resource
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        context.getBeansOfType(Object.class).keySet().forEach(System.out::println);
    }
}
