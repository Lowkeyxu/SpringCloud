/*
 * @(#) IndexService.java 2018/10/29
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.sericefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 直接关联服务名称
 * @author xuwc
 * @version 1.0
 * @since 2018/10/29
 */
@FeignClient(value = "service-hi",fallback = SchedualIndexServiceHystric.class)
public interface IndexService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String indexTest(@RequestParam(value = "name") String name);
}
