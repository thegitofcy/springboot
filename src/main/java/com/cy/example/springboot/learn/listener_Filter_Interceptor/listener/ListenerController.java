package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * <p></p>
 *
 * @author : cy
 */
@Controller
@Slf4j
@RequestMapping("/listener")
public class ListenerController {

    @RequestMapping("/test")
    @ResponseBody
    public String listenerTest(HttpServletRequest request) {
        ServletContext servletContext = request.getServletContext();
        String token = (String)servletContext.getAttribute("token");
        log.info("servletContext add token : [ {} ]",token);
        return token;
    }
}
