package com.ns.clould.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ns.clould.bean.User;
import com.ns.clould.bean.UserMain;
import com.ns.clould.service.UserMainService;


@RestController
public class ProviderController {
	    Logger logger = LoggerFactory.getLogger(ProviderController.class);
		@Autowired
		private DiscoveryClient client;
		@Autowired
		private UserMainService userMainService;
		@RequestMapping("myFirst")
		public String myFirst(@RequestParam("name")String name){
			 ServiceInstance instance = client.getLocalServiceInstance();
			 logger.info("====服务3号===");
			 logger.info("服务提供者打印Ip；"+instance.getHost());
			return "hello"+name;
			
		}
		@RequestMapping("getUser")
		public Object getUser(int userid){
			/*User user  = new User("jack",20,true);
			return user;*/
			UserMain userMain = userMainService.selectByPrimaryKey(userid);
			return userMain;
			
		}
}
