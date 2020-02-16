/**
 * <p>SpringBoot 环境下的监听器</p>
 *
 * @author : cy
 *
 *
 * SpringBoot 提供的事件和事件监听器
 *  {@link org.springframework.context.ApplicationListener} 和 {@link org.springframework.context.ApplicationEvent}
 *  ApplicationListener: SpringBoot 中的事件监听器的父类. ApplicationListener 的父类为 : 父类为 {@link java.util.EventListener}
 *  ApplicationEvent : SpringBoot 中的事件的父类. ApplicationEvent 的父类为 : {@link java.util.EventObject}
 *      SpringBoot 支持的事件类型有:
 *          1. ApplicationStartingEvent : SpringBoot 框架开始启动事件
 *          2. ApplicationStartedEvent : SpringBoot 框架启动完成事件, Context 和 bean 都初始化完成.
 *          3. ApplicationPreparedEvent : SpringBoot 框架启动, context 创建完毕, bean 还没有创建.
 *          4. ApplicationEnvironmentPreparedEvent: SpringBoot 框架环境准备完毕, Context 还没有创建, bean 也没有创建
 *          5. ApplicationFailedEvent : SpringBoot 框架启动失败事件.
 *
 *  使用方式:
 *      1. 实现自己的监听器, 实现 SpringBoot 的监听器 ApplicationListener, 泛型为响应的事件实现.(就是上边提供的支持的 5 中事件中的一个)
 *      2.
 */
package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot;