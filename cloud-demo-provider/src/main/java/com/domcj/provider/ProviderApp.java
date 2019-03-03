package com.domcj.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 18:40
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class ProviderApp {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApp.class, args);
	}
}
