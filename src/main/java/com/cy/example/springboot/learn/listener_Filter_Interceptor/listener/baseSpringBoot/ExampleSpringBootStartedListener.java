package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>SpringBoot 实现的监听器</p>
 *
 * @author : cy
 *
 * SpringBoot 框架启动完成事件, Context 和 bean 都初始化完成.
 */
@Slf4j
@Component
public class ExampleSpringBootStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Spring Boot 框架启动完成, context 和 bean 都初始化完成了");
    }
}
