package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.servletRequest;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * <p>监听请求中属性的增加, 删除, 变更</p>
 *
 * @author : cy
 */
@Slf4j
@WebListener
public class ExampleServletRequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("当前请求增加属性了");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("当前请求移除属性了");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("当前请求变更属性了");
    }
}
