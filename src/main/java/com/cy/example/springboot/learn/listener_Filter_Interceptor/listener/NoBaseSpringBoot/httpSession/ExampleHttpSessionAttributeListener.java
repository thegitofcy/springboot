package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.httpSession;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * <p>监听会话中属性的增加, 删除, 替换</p>
 *
 * @author : cy
 */
@Slf4j
@WebListener
public class ExampleHttpSessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        log.info("当前会话增加了一个属性");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        log.info("当前会话移除了一个属性");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        log.info("当前会话变更了一个属性");
    }
}
