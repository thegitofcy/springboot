package com.cy.example.springboot.base.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>thymeleaf 向前台展示数据的实体类</p>
 * @author : cy
 */
@Data
@AllArgsConstructor
public class ThymeleafData {
    private String id;
    private String username;
}
