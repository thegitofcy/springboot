package com.cy.example.springboot.base.env.model;

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
    private String username;
    private String passwd;
    private String url;
}
