package com.ns.clould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableDiscoveryClient //服务提供者
//@EnableConfigServer  启动spring-cloud的配置中心，版本在1.4.0才有
public class ClientApplication {
		public static void main(String[] args) {
			SpringApplication.run(ClientApplication.class, args);
		}

}
