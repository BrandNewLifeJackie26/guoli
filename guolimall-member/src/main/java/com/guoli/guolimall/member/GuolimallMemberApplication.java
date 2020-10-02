package com.guoli.guolimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.guoli.guolimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GuolimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuolimallMemberApplication.class, args);
	}

}
