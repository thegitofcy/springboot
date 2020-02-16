package com.cy.example.springboot.base.controller.thymeleaf;

import com.cy.example.springboot.base.thymeleaf.model.ThymeleafData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>关于 thymeleaf 的操作</p>
 * @author : cy
 */
@Controller
@RequestMapping("/admin/thymeleaf")
public class ThymeleafController {

    /**
     * 向前台页面发送单个的数据. 用于演示 thymeleaf 处理 单个数据
     * @param model
     * @return 返回一个页面
     */
    @GetMapping("/test1")
    public String test1(Model model){
        model.addAttribute("name", "<h1>thymeleaf</h1>");
        return "thymeleaf";
    }

    /**
     * 向前台页面发送 list. 用于演示 thymeleaf 处理 list
     * @param model
     * @return 返回一个页面
     */
    @GetMapping("/list")
    public String getList(Model model){
        List<ThymeleafData> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            ThymeleafData thymeleafData = new ThymeleafData(String.valueOf(i), "name_" + i);
            list.add(thymeleafData);
        }
        model.addAttribute("thymeleafData", list);
        return "list";
    }
}
