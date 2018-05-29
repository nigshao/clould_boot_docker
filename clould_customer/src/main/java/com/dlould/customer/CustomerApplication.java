package com.dlould.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//使用ribbon负载均衡器，ribbon本来是通过客户端配置ribbonServerList服务端列表去轮询访问以达到负载均衡的目的
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients  //这个注解是开启feign的 ，不加的话只能用Ribbon负载均衡器来获取客户端数据
@EnableHystrix //开启断路器  
public class CustomerApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
   
}
