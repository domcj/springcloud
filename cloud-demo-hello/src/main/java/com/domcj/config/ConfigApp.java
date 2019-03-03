package com.domcj.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 15:15
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApp.class, args);
	}
}
