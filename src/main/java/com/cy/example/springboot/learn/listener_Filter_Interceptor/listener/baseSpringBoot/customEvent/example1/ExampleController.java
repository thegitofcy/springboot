package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.customEvent.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author : cy
 */
@Slf4j
@RestController
@RequestMapping("/event")
public class ExampleController {

    @Autowired
    private PublishEvent publishEvent;

    @RequestMapping("/publish")
    public String event(){
        publishEvent.publish("发布事件测试");
        return "监听事件测试";
    }
}
