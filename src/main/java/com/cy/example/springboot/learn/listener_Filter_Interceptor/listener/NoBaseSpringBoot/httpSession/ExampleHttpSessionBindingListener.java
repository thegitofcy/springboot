package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.httpSession;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * <p>监听一个属性绑定到一个会话或者从一个会话移除</p>
 *
 * @author : cy
 */
@Slf4j
@WebListener
public class ExampleHttpSessionBindingListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        log.info("属性名为 : [ {} ] 的属性绑定到 session ID 为 : [ {} ] 的会话了.", event.getName(), event.getSession().getId());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        log.info("属性名为 : [ {} ] 的属性从 session ID 为 : [ {} ] 的会话解绑了.", event.getName(), event.getSession().getId());
    }
}
