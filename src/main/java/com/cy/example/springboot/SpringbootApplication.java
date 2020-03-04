package com.cy.example.springboot;

import com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.ExampleSpringBootPreparedListener;
import com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.ExampleSpringBootStartedListener;
import com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.ExampleSpringBootStartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ServletComponentScan(basePackages = {"com.cy.example.springboot.learn.listener_Filter_Interceptor"})
public class SpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
//        run.addApplicationListener(new ExampleSpringBootPreparedListener());

    }

}
