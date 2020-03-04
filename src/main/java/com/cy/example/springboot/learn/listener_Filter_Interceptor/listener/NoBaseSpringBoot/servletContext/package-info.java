/**
 * <p>context 上下文监听器.</p>
 *
 * @author : cy
 *
 * {@link javax.servlet.ServletContextListener}
 *      父类: {@link java.util.EventListener}
 *      用于监听 context 上下文的创建和销毁. 父类为 java.util.EventListener
 *
 *      非 SpringBoot 环境下使用:
 *          1. 实现自己的监听器, 实现 ServletContextListener 接口.
 *          2. 在 web.xml 中添加配置 :
 *              <context-param>
 *                  <param-name>contextConfigLocation</param-name>
 *                  <param-value>classpath*:spring-context.xml</param-value>
 *              </context-param>
 *
 *              <listener>
 *                  <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
 *              </listener>
 *
 *
 * {@link javax.servlet.ServletContextAttributeListener}
 *      父类: {@link java.util.EventListener}
 *      用于监听 context 上下文中属性的增加, 删除, 变更
 *
 *      非 SpringBoot 环境下使用:
 *
 *
 *
 *
 *
 * 以上两个监听器在 SpringBoot 环境下使用 :
 *          1. 编写自己的监听器, 实现 ServletContextListener 或者 ServletContextAttributeListener 接口
 *          2. 在自己的 监听器 上使用注解 : @WebListener
 *          3. 在启动类上添加注解: @ServletComponentScan
 *      SpringBoot 环境下也可以使用 SpringBoot 提供的监听器.
 *          {@link org.springframework.context.ApplicationListener} 和 {@link org.springframework.context.ApplicationEvent}
 *          详情 : {@link com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot}
 */
package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.servletContext;