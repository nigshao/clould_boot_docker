package com.ns.clould.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {
	    Logger logger = LoggerFactory.getLogger(ProviderController.class);
		@Autowired
		private DiscoveryClient client;
		@RequestMapping("myFirst")
		public String myFirst(){
			 ServiceInstance instance = client.getLocalServiceInstance();
			 logger.info("服务提供者打印Ip；"+instance.getHost());
			return "cloud-first";
			
		}
}
