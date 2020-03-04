package com.cy.example.springboot.learn.listener_Filter_Interceptor.listener.baseSpringBoot.customEvent.example1;

import com.cy.example.springboot.common.utils.ClazzUtils;
import com.cy.example.springboot.learn.annoations.MyAnnoation;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;

/**
 * <p>1. 自定义事件</p>
 *
 * @author : cy
 */
@Slf4j
public class MyEvent extends ApplicationEvent {

    private String msg;

    /**
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg set msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * 在自定义事件的构造方法中除了第一个source参数，其他参数都可以去自定义，
     * 可以根据项目实际情况进行监听传参，这里就只定义个简单的String字符串的透传
     *
     * @param source
     * @param msg
     */
    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    @Resource
    private ApplicationContext context;

    public void eventMethod() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        log.info("自定义事件: 字段检查开始");
        List<String> clazzName = ClazzUtils.getClazzName("com.cy.example.springboot.base.env.model", true);
        for (String s : clazzName) {
            Class<?> clazz = Class.forName(s);
            clazz.isLocalClass();
            Class<? extends Class> aClass = clazz.getClass();
            if (clazz.getClass() instanceof Class ) {
                Object obj = clazz.newInstance();
                for (Field field : clazz.getDeclaredFields()) {
                    if (field.isAnnotationPresent(MyAnnoation.class)) {
                        field.setAccessible(true);
                        String name = field.getName();
                        Object o = field.get(obj);
                        if (null == o || "".equals(o)) {
                            log.error("[ {}#{} ] 字段不能为空!", s, name);
                        }
                    }
                }
            }
        }
    }


}
