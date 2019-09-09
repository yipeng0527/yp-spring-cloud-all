package com.yp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YpSpringCloudServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpSpringCloudServiceHelloApplication.class, args);
	}

}
