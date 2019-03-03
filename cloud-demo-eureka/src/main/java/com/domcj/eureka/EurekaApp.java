package com.domcj.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 18:19
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApp.class, args);
	}
}
