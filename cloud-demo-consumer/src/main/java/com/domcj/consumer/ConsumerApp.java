package com.domcj.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 19:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
public class ConsumerApp {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp.class, args);
	}
}
