package com.ns.clould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//服务提供者
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {
		public static void main(String[] args) {
			SpringApplication.run(ClientApplication.class, args);
		}

}
