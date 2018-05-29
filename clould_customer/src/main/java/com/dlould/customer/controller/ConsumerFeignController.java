package com.dlould.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlould.customer.service.FeignSrvice;

@RestController
public class ConsumerFeignController {
	Logger logger = LoggerFactory.getLogger(ConsumerFeignController.class);
	
	@Autowired
    FeignSrvice feignService;
	@RequestMapping("/sayHello")
	public String say(){
		logger.info("aa");
		return feignService.myFirst("feignO");
	}
	@RequestMapping("/getUser")
	public Object getUser(){
		return feignService.getUser();
	
	}
}
