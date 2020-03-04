/**
 * <p>ServletRequestListener 监听器</p>
 *
 * @author : cy
 *
 * {@link javax.servlet.ServletRequestListener}
 *      父类: {@link java.util.EventListener}
 *      监听器用于监听 ServletRequest 对象的创建和销毁, 也就是监听每次请求的到来和结束.
 *
 *
 *
 * {@link javax.servlet.ServletRequestAttributeListener}
 *      父类: {@link java.util.EventListener}
 *      监听器用于监听请求中属性的增加,删除, 变更.
 *
 *
 * 以上两个监听器在 非 SpringBoot 环境下使用:
 *      1. 编写自己的监听器, 实现 ServletRequestListener 或者 ServletRequestAttributeListener 接口
 *      2. 在 web.xml 中添加配置
 *             <listener>
 *                  <listener-class>监听器类所在路径.监听器名字</listener-class>
 *              </listener>
 *
 *
 * 以上两个监听器在 SpringBoot 环境下使用:
 *          1. 编写自己的监听器, 实现 ServletRequestListener 或者 ServletRequestAttributeListener 接口.
 *          2. 在自己的 监听器 上添加注解 : @WebListener
 *          3. 在启动类上添加注解 : @ServletConponentScan
 */
package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.NoBaseSpringBoot.servletRequest;