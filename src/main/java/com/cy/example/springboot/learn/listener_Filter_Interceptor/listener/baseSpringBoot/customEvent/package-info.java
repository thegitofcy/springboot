/**
 * <p>自定义事件的实现</p>
 *
 * @author : cy
 *
 * 自定义事件实现原理:
 * SpringBoot 自定义事件步骤: {@link com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.customEvent}
 *      1. 自定义事件. 继承 {@link org.springframework.context.ApplicationEvent}
 *      2. 事件监听. 实现接口 {@link org.springframework.context.ApplicationListener}, 泛型为自定义的事件.
 *      3. 事件发布. 调用 : {@link org.springframework.context.ApplicationContext#publishEvent(org.springframework.context.ApplicationEvent)}
 *
 *
 * 方式一:
 */
package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.customEvent;