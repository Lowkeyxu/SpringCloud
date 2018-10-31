/*
 * @(#) IndexController.java 2018/10/29
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.serviceribbon.controller;

import com.lowkey.serviceribbon.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/10/29
 */
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/index")
    public String index(String name){
        return indexService.indexTest(name);
    }
}
