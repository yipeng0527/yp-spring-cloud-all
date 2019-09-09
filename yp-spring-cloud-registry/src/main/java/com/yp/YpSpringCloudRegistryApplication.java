package com.yp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YpSpringCloudRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpSpringCloudRegistryApplication.class, args);
	}

}
