package com.domcj.provider.entity;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2018/12/01 18:50
 */
public class User {
	private Long id;
	private String username;
	private int age;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}
}
