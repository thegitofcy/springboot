/**
 * <p>关于配置文件配置项的操作</p>
 * @author : cy
 *
 * 读取 Springboot 配置文件中的数据有 3 中方式:
 *  1. @Value. 默认读取的是 application.properties 配置文件,
 *      作用: 从配置文件中读取指定的配置项, 并注入到标注的属性中.
 *      使用方式:
 *          1. 直接在类的成员变量上使用, 然后可以在类中直接使用.
 *          2. 在一个使用 @Component 标注的类中使用, 标注在类的成员变量上, 然后在要使用配置项值得地方使用 @Autiowire
 *
 */
package com.cy.example.springboot.base.env;

