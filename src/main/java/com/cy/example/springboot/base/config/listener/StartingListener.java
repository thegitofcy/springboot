package com.cy.example.springboot.base.config.listener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author : cy
 */
@Slf4j
@Component
public class StartingListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        log.info("系统启动中.....");
        SpringApplication springApplication = applicationStartingEvent.getSpringApplication();
        log.info(JSON.toJSONString(springApplication));

    }
}
