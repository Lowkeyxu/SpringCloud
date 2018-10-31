/*
 * @(#) ConfigController.java 2018/10/30
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/10/30
 */
@RestController
public class ConfigController {

    @Value("${zuul.routes.api-a.path}")
    private String msg;

    @RequestMapping("/index")
    public String index(){
        return "来自cofig信息："+msg;
    }
}
