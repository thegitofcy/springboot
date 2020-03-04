/**
 * <p>关于 HttpSession 的监听器</p>
 *
 * @author : cy
 *
 *
 * {@link javax.servlet.http.HttpSessionListener}
 *      父类 : {@link java.util.EventListener}
 *      监听会话的创建和销毁
 *
 *
 *
 * {@link javax.servlet.http.HttpSessionAttributeListener}
 *      父类: {@link java.util.EventListener}
 *      监听会话中属性的增加, 删除, 变更
 *
 *
 *
 * {@link javax.servlet.http.HttpSessionBindingEvent}
 *      父类: {@link java.util.EventListener}
 *      监听属性和会话的 绑定以及解绑
 *
 *
 * 以上三个监听器在 非 SpringBoot 环境下使用:
 *      1. 编写自己的监听器, 实现 HttpSessionListener, HttpSessionAttributeListener 或者 HttpSessionBindingEvent 接口
 *      2. 在 web.xml 中添加配置
 *             <listener>
 *                  <listener-class>监听器类所在路径.监听器名字</listener-class>
 *              </listener>
 *
 * 以上三个监听器在 SpringBoot 环境下使用 :
 *          1. 编写自己的监听器, 实现 HttpSessionListener, HttpSessionAttributeListener 或者 HttpSessionBindingEvent 接口
 *          2. 在自己的 监听器 上使用注解 : @WebListener
 *          3. 在启动类上添加注解: @ServletComponentScan
 *      SpringBoot 环境下也可以使用 SpringBoot 提供的监听器.
 *          {@link org.springframework.context.ApplicationListener} 和 {@link org.springframework.context.ApplicationEvent}
 *          详情 : {@link com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot}
 */
package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.httpSession;