package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.servletRequest;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * <p>收到请求时得到通知</p>
 *
 * @author : cy
 */
@Slf4j
@WebListener
public class ExampleServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("ServletRequest 对象销毁了");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("ServletRequest 对象创建了");
        ServletContext servletContext = sre.getServletContext();
        servletContext.setAttribute("token", "123456");
    }
}
