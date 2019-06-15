package com.domcj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/06/15 11:51
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApp.class, args);
	}
}
