package com.domcj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/06/15 15:18
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApp {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApp.class, args);
	}
}
