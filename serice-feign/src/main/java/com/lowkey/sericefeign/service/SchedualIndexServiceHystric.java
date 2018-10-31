/*
 * @(#) SchedualIndexServiceHystric.java 2018/10/29
 *
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.lowkey.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author xuwc
 * @version 1.0
 * @since 2018/10/29
 */
@Component
public class SchedualIndexServiceHystric implements IndexService {
    @Override
    public String indexTest(String name) {
        return "Feign sorry:"+name;
    }
}
