package com.domcj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/06/15 11:16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApp.class, args);
	}
}
