/*
 * @(#) IndexService.java 2018/10/29
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/10/29
 */
@Service
public class IndexService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexError")
    public String indexTest(String name){
        return restTemplate.getForObject("http://SERVICE-HI/index?name="+name,String.class);
    }

    /**
     * 断路器
     * @param name
     * @return
     */
    public String indexError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
