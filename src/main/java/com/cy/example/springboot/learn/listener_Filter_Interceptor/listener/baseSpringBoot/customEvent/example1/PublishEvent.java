package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.customEvent.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>3. 发布事件</p>
 *
 * @author : cy
 */
@Slf4j
@Component
public class PublishEvent {

    /**
     * 上下文对象
     */
    @Resource
    private ApplicationContext applicationContext;

    /**
     * 发布事件
     * @param msg
     */
    public void publish(String msg){

        // 通过上下文发布监听
        applicationContext.publishEvent(new MyEvent(this, ""));
    }
}
