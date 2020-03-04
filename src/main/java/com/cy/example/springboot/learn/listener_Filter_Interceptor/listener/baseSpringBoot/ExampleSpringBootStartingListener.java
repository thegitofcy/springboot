package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>SpringBoot 实现的监听器</p>
 *
 * @author : cy
 *
 * SpringBoot 框架开始启动事件
 */
@Slf4j
//@Component
public class ExampleSpringBootStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("Spring Boot 框架开始启动!");
    }
}
