package com.domcj.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 19:41
 */
@Component
public class UserServiceFeignImpl implements UserServiceFeign{

	@Override
	public String getUser() {
		return null;
	}
}
