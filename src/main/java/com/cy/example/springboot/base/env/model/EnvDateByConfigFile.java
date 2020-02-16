package com.cy.example.springboot.base.env.model;

import com.cy.example.springboot.base.annoations.Validate;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>从指定的配置文件中读取配置项</p>
 *
 * @author : cy
 */
@Component
@ConfigurationProperties(prefix = "mapping.to.class.attribute")
@PropertySource(value = "env.yml")
@Data
@Validate(validate = true)
public class EnvDateByConfigFile{

    private String attr1;
    private String attr2;
    private String attr3;

    {
        Class<EnvDateByConfigFile> clzz = EnvDateByConfigFile.class;
        if (clzz.isAnnotationPresent(Validate.class)) {

        }
    }
}
