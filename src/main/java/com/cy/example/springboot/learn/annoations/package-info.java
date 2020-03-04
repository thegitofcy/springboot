/**
 * <p>关于注解的学习</p>
 *
 * @author : cy
 *
 *
 * 自定义注解实现方式:
 *
 * @Target({ElementType.FIELD})
 * @Retention(RetentionPolicy.RUNTIME)
 *
 *      1. 创建自己的注解, 并在自定义的注解上添加两个注解 :
 *          1. @Target : 描述了注解修饰的对象范围, 取值在 {@link java.lang.annotation.ElementType} 中定义.
 *              ElementType.METHOD : 用于描述方法
 *              ElementType.PACKAGE: 用于描述包
 *              ElementType.PARAMETER : 用于描述方法变量
 *              ElementType.TYPE : 用于描述类, 接口或者 Enum 类型
 *
 *          2. @Retention : 表示注解保留时间长短. 取值在 {@link java.lang.annotation.RetentionPolicy} 中取值.
 *              RetentionPolicy.SOURCE : 在源文件中有效, 编程过程中会被忽略.
 *              RetentionPolicy.CLASS : 随源文件一起编译在class文件中，运行时忽略
 *              RetentionPolicy.RUNTIME : 在运行时有效.
 *
 *           需要注意的是 : 只有定义在 RetentionPolicy.RUNTIME 时, 我们才能通过注释的方式获取到注解.
 *
 *
 * 涉及到的方法 :
 *      isAnnotationPresent(Annoation.class) : 判断是否有指定类型的注解.
 *      getAnnotation(Annoation.class) :
 *
 */
package com.cy.example.springboot.learn.annoations;