package com.leave.centralmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.leave.centralmall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class CentralmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralmallMemberApplication.class, args);
	}

}
