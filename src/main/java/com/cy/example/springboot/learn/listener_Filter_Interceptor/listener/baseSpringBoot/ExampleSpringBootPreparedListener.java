package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>SpringBoot 实现的监听器</p>
 *
 * @author : cy
 *
 * SpringBoot 框架启动, context 创建完毕, bean 还没有创建.
 */
@Slf4j
@Component
public class ExampleSpringBootPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        log.info("Spring Boot 框架启动中, context 初始化完成, bean 还没有创建");
    }
}
