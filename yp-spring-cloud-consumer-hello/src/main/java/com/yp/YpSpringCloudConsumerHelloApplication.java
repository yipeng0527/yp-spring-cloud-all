package com.yp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class YpSpringCloudConsumerHelloApplication {

	@LoadBalanced
	@Bean(value = "restTemplate")
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Primary
	@Bean(value = "lbcRestTemplate")
	RestTemplate lbcRestTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(YpSpringCloudConsumerHelloApplication.class, args);
	}

}
