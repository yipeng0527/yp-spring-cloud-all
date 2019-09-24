package com.yp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YpSpringCloudUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpSpringCloudUserServiceApplication.class, args);
	}

}
