package com.domcj.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 19:37
 */
@FeignClient(value = "cloudprovider", fallback = UserServiceFeignImpl.class)
public interface UserServiceFeign {
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	String getUser();
}
