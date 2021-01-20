package com.system.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class HrOauthApplication {

	//spring security
	//UserDetailService é uma interface que usa para buscar o usuario pelo username do banco, retorna uma userDetail


	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

}
