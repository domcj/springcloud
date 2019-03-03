package com.domcj.provider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.domcj.provider.entity.User;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 18:56
 */
@Mapper
public interface UserMapper {
	@Select("select * from user where id = #{id}")
	public User findUserById(Long id);
}
