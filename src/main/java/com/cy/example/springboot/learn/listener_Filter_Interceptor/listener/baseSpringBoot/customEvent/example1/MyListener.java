package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.customEvent.example1;

import com.cy.example.springboot.base.env.model.EnvDateBy_ConfigurationProperties;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * <p>2. 监听事件</p>
 *
 * @author : cy
 */
@Slf4j
@Component
public class MyListener implements ApplicationListener<MyEvent> {

    /**
     * 对监听到的事件进行处理
     * @param event 监听到的事件对象
     */
    @SneakyThrows
    @Override
    public void onApplicationEvent(MyEvent event) {
        event.eventMethod();
    }
}
