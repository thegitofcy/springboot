/**
 * <p>监听器</p>
 *
 * 监听器 用于监听某个时间的发生.
 *       当该监听时间发生了, 就会告诉监听者监听器发生的一些事, 同时也会把该事件对象发送给监听器对象. 根据这个事件对象, 监听器可以做一些操作
 *
 *
 * @author : cy
 *
 *
 * 涉及内容有:
 *  {@link javax.servlet} 包下的监听器. 这些监听器在非 SpringBoot 环境下的使用方式简介, 以及在 SpringBoot 环境下的使用方式.
 *  在 SpringBoot 环境下, 可以使用 {@link javax.servlet} 包下的监听器, 也可以使用 SpringBoot 提供的监听器, 都可以. 它们的父类都是 {@link java.util.EventListener}
 *
 */
package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener;