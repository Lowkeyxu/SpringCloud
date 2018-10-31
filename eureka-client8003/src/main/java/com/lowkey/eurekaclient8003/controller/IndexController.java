/*
 * @(#) IndexController.java 2018/10/29
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.eurekaclient8003.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/10/29
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(String name){
        return name+"hello,我是来自"+port;
    }
}
