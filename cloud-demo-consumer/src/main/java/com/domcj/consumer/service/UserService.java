package com.domcj.consumer.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 19:33
 */
@Service
public class UserService {
	@Resource
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback")
	public String getUser(Long id) {
		return restTemplate.getForObject("", String.class);
	}

	private String falllback() {
		return "出错啦";
	}
}
