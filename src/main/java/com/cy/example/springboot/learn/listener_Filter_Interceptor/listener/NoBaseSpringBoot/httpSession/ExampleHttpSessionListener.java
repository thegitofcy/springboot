package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.httpSession;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * <p>监听会话的创建和销毁</p>
 *
 * @author : cy
 */
@Slf4j
@WebListener
public class ExampleHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("会话创建了, 会话 ID: [ {} ]", se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("会话销毁了, 会话 ID: [ {} ]", se.getSession().getId());
    }
}
