package com.cy.example.springboot.base.env.model;

import com.cy.example.springboot.learn.annoations.MyAnnoation;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>从默认的配置文件 application.properties 中加载配置项</p>
 * @author : cy
 */
@Component
@ConfigurationProperties(prefix = "env.cp")
@Data
public class EnvDateBy_ConfigurationProperties {
    @MyAnnoation
    private String username;
    @MyAnnoation
    private String passwd;
    @MyAnnoation
    private String url;
}
