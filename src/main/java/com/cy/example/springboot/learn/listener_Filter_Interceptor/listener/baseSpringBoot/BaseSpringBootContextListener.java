package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * <p>SpringBoot 实现的 关于 Context 和 bean 的监听器</p>
 *
 * @author : cy
 *
 *
 */

public class BaseSpringBootContextListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {

    }
}
