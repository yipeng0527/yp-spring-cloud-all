package com.yp.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ex-yipeng
 * @version Id: HelloController.java, v 0.1 2019/9/5 14:40 ex-yipeng Exp $
 */
@RestController
public class HelloController {

    private Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;

    @Value("${server.port}")
    private int serverPost;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        this.log.info("/hello, instanceId:{}, host:{}", eurekaInstanceConfig.getInstanceId(), eurekaInstanceConfig.getHostName(false));
        return "Hello, Spring Cloud! My port is " + String.valueOf(serverPost);
    }
}
