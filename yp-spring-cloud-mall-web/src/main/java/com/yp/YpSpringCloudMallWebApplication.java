package com.yp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.yp.**")
@EnableDiscoveryClient
@SpringBootApplication
public class YpSpringCloudMallWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpSpringCloudMallWebApplication.class, args);
	}

}
