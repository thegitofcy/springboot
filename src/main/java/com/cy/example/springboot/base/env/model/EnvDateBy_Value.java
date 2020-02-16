package com.cy.example.springboot.base.env.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>绑定配置文件中配置参数的实体类</p>
 * @author : cy
 */
@Component
public class EnvDateBy_Value {

    @Value("${env.vl.toCalss.attr4}")
    public String attr4;

    @Value("${env.vl.toCalss.attr5}")
    public String attr5;

    @Value("${env.vl.toCalss.attr6}")
    public String attr6;
}
