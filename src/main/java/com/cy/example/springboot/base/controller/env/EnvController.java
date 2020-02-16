package com.cy.example.springboot.base.controller.env;

import com.cy.example.springboot.base.env.model.EnvDateByConfigFile;
import com.cy.example.springboot.base.env.model.EnvDateBy_ConfigurationProperties;
import com.cy.example.springboot.base.env.model.EnvDateBy_Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>关于配置文件配置项的操作</p>
 * @author : cy
 */
@Controller
@RequestMapping("/admin/env")
@Slf4j
public class EnvController {

    //========================================= [读取配置文件配置参数方式一] ==========================================================
    /**
     *  使用 @ConfigurationProperties(prefix = "配置项前缀")标注在自定义的类中, 并将以指定前缀为前缀的配置项映射到自定义类的属性上.
     */

    /**
     * {@link EnvDateBy_ConfigurationProperties} 使用 @ConfigurationProperties(prefix = "custom.env")
     * 绑定了默认配置文件 application.properties 中的的配置参数
     */
    @Autowired
    private EnvDateBy_ConfigurationProperties envDate;

    /**
     * 从 {@link EnvDateBy_ConfigurationProperties} 读取配置信息
     * @param model
     * @return 返回页面名称.
     */
    @RequestMapping("/fromClass")
    public String getEnvFromClassBy_ConfigurationProperties(Model model){
        log.info("使用 [ {} ] 注解, 根据配置文件内配置项的前缀, 将配置文件内参数封装到实体类内," +
                " 并使用注解 [ {} ] 将实体类交给 Spring 管理, 然后注入, 就可以使用了", "@ConfigurationProperties", "@Component");
        log.info("env.ConfigurationProperties.url = {}", envDate.getUrl());
        log.info("env.ConfigurationProperties.username = {}", envDate.getUsername());
        log.info("env.ConfigurationProperties = {}", envDate.getPasswd());

        model.addAttribute("showType", "1");    // 页面判断
        model.addAttribute("envDate", envDate);
        return "env/env";
    }

    /**
     * {@link EnvDateByConfigFile} 使用 @ConfigurationProperties(prefix = "custom.env")
     * 使用 @PropertySource(value= "指定的配置文件") 从指定配置文件 env.yml 中加载配置参数
     */
    @Autowired
    private EnvDateByConfigFile envDateByConfigFile;

    @RequestMapping("/fromConfigFile")
    public String getEnvFromConfigFile(Model model){
        log.info("使用 [ {} ] 注解, 根据配置文件内配置项的前缀, 将配置文件内参数封装到实体类内," +
                " 并使用注解 [ {} ] 将实体类交给 Spring 管理, 然后注入, 就可以使用了", "@ConfigurationProperties", "@Component");
        log.info("mapping.to.class.attribute.attr1 = {}", envDateByConfigFile.getAttr1());
        log.info("mapping.to.class.attribute.attr2 = {}", envDateByConfigFile.getAttr2());
        log.info("mapping.to.class.attribute.attr3 = {}", envDateByConfigFile.getAttr3());

        model.addAttribute("showType", "2");    // 页面判断
        model.addAttribute("envDateByConfigFile", envDateByConfigFile);
        return "env/env";
    }


    //========================================= [读取配置文件配置参数方式二] ==========================================================
    /**
     * @Value 有两种使用方式
     *  第一种: 直接将指定全称的配置项映射到当前类的属性上.
     *
     *  第二种: 将指定全称的配置项映射到自定义类的属性上.
     */

    /**
     * 第一种 : 使用 @Value 将配置项映射到属性上, 需要提供 get/set 方法
     */
    @Value("${env.value.toClassAttribute.attr1}")
    private String attr1;

    @Value("${env.value.toClassAttribute.attr2}")
    private String attr2;

    @Value("${env.value.toClassAttribute.attr3}")
    private String attr3;

    @RequestMapping("/fromValue1")
    public String getEnvFromClassAttribute(Model model){
        log.info("使用 [ {} ] 注解, 根据配置文件内配置项的全称, 将配置文件内参数映射到当前类指定的属性上," +
                " 然后在当前类中就可以直接使用了", "@Value");
        log.info("env.value.toClassAttribute.attr1 = {}", attr1);
        log.info("env.value.toClassAttribute.attr2 = {}", attr2);
        log.info("env.value.toClassAttribute.attr3 = {}", attr3);
        model.addAttribute("showType", "3");    // 页面判断
        model.addAttribute("attr1", attr1);
        model.addAttribute("attr2", attr2);
        model.addAttribute("attr3", attr3);
        return "env/env";
    }

    /**
     * 第二种使用 @Value 将指定全称的配置项映射到自定义的类的属性中. 类的属性要使用 public, 否则会报错,不需要 get/set 方法
     * 自定义类需要使用 @Component.
     * {@link EnvDateBy_Value}
     */
    @Autowired
    private EnvDateBy_Value envDateByValue;

    @RequestMapping("/fromValue2")
    public String getEnvFromClassBy_Vale(Model model){
        log.info("使用 [ {} ] 注解, 根据配置文件内配置项的全称, 将配置文件内参数映射到自定义类指定的属性上," +
                "自定义类需要使用注解 [ {} ],  然后在当前类中就可以直接使用了", "@Value", "@Component");
        log.info("env.value.toCalss.attr4 = {}", envDateByValue.attr4);
        log.info("env.value.toCalss.attr5 = {}", envDateByValue.attr5);
        log.info("env.value.toCalss.attr6 = {}", envDateByValue.attr6);

        model.addAttribute("showType", "4");    // 页面判断
        model.addAttribute("attr4", envDateByValue.attr4);
        model.addAttribute("attr5", envDateByValue.attr5);
        model.addAttribute("attr6", envDateByValue.attr6);
        return "env/env";
    }

}
