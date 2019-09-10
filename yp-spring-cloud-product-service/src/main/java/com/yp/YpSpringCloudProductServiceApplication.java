package com.yp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.yp.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YpSpringCloudProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YpSpringCloudProductServiceApplication.class, args);
	}

}
