package com.cy.example.springboot.base.config.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <p>启动完成</p>
 *
 * @author : cy
 */
@Slf4j
@Component
public class StartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        log.info("系统启动完毕!");
        ConfigurableApplicationContext applicationContext = applicationStartedEvent.getApplicationContext();
//        applicationContext.getBean()
    }
}
