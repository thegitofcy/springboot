package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.servletContext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * <p>ServletContextListener : 用于监听 context 上下文的创建和销毁. 需要在 web.xml 中添加监听器. </p>
 *
 * @author : cy
 */
@Slf4j
@WebListener
public class ExampleServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("context 初始化了");
        ServletContext context = sce.getServletContext();
        context.setAttribute("testValue", "testValue");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("context 销毁了");
    }
}
