package com.guoli.guolimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.guoli.guolimall.product.dao")
@SpringBootApplication
public class GuolimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuolimallProductApplication.class, args);
	}

}
