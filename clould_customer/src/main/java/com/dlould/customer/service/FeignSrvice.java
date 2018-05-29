  package com.dlould.customer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
// feifnClient的fallback是feign对断路器的支持
@FeignClient(name = "say-hello",fallback = FeignServiceImpl.class)
public interface FeignSrvice {
	//用feign获取数据
	@RequestMapping(value="myFirst",method = RequestMethod.GET)
	String myFirst(@RequestParam("name") String name);
	
	@RequestMapping(value="getUser",method = RequestMethod.GET)
	Object getUser();
	
	
	


}
