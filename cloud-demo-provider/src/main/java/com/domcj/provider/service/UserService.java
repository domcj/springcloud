package com.domcj.provider.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.domcj.provider.entity.User;
import com.domcj.provider.mapper.UserMapper;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 19:16
 */
@Service
public class UserService {
	@Resource
	private UserMapper userMapper;

	public User findUser(Long id) {
		return userMapper.findUserById(id);
	}
}
