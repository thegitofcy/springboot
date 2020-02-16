package com.cy.example.springboot.base.config;

import com.cy.example.springboot.base.interceptor.ValidateInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>拦截器配置类</p>
 *
 * @author : cy
 */

public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ValidateInterceptor().)
    }
}
