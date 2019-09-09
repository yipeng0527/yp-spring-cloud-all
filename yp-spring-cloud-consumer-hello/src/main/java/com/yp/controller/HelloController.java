package com.yp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author ex-yipeng
 * @version Id: HelloController.java, v 0.1 2019/9/5 15:43 ex-yipeng Exp $
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    @Qualifier(value = "restTemplate")
    private RestTemplate restTemplate;

    @Autowired
    @Qualifier(value = "lbcRestTemplate")
    private RestTemplate lbcRestTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return restTemplate.getForEntity("http://service-hello/hello", String.class).getBody();
    }

    @RequestMapping(value = "helloEx", method = RequestMethod.GET)
    public String helloEx() {
        ServiceInstance instance = this.loadBalancerClient.choose("service-hello");
        URI helloUri = URI.create(String.format("http://%s:%s/hello", instance.getHost(), instance.getPort()));
        logger.info("Target service uri = {}. ", helloUri.toString());
        return new RestTemplate().getForEntity(helloUri, String.class).getBody();
    }

    @RequestMapping(value = "helloExLbc")
    public String helloExLbc() {
        ServiceInstance instance = this.loadBalancerClient.choose("service-hello");
        URI helloUri = URI.create(String.format("http://%s:%s/hello", instance.getHost(), instance.getPort()));
        logger.info("Target service uri={}.", helloUri.toString());
        return lbcRestTemplate.getForEntity(helloUri, String.class).getBody();
    }
}
