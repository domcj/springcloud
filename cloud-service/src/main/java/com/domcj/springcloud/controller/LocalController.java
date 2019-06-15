package com.domcj.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/06/15 12:04
 */
@RestController
public class LocalController {

	@Value("${local.company:domcj}")
	private String localCompany;

	@GetMapping("/local")
	public String local() {
		return localCompany;
	}
}
