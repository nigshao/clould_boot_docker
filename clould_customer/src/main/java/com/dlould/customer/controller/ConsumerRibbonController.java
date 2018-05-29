package com.dlould.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dlould.customer.service.RibbonService;

@RestController
public class ConsumerRibbonController {
  @Autowired
  public RibbonService service;
  	//Ribbo 调用服务返回字符串
    @RequestMapping(value = "/sayInRibbon", method = RequestMethod.GET)
    public String add() {
        return service.sayHelloService();
    }
    //Ribbon返回对象
    @GetMapping("/say2")
    public Object say2(){
    	return service.getUser();
    }
    //断路器
	@RequestMapping("/hiHystrix")
	public Object hiHystrix(){
		return service.hiHystrix();
	}
}