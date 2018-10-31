/*
 * @(#) IndexController.java 2018/10/29
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.sericefeign.controller;

import com.lowkey.sericefeign.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/10/29
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String indexTest(@RequestParam String name){
        return indexService.indexTest(name);
    }

}
