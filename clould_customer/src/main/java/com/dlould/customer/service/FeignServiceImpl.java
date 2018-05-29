package com.dlould.customer.service;

import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignSrvice{

	@Override
	public String myFirst(String name) {
		// TODO Auto-generated method stub
		return "feign断路器生效";
	}

	@Override
	public Object getUser() {
		// TODO Auto-generated method stub
		return "feign断路器生效";
	}

}
