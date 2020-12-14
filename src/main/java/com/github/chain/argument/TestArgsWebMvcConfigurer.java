package com.github.chain.argument;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @author 石少东
 * @date 2020-10-29 23:18
 * @since 1.0
 */


@Component
public class TestArgsWebMvcConfigurer implements WebMvcConfigurer {

    @Resource
    private ObjectProvider<Set<HandlerMethodArgumentResolver>> provider;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        provider.ifAvailable(resolvers::addAll);
    }

}
