package com.irootech.springcloud.test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudApplication {

	public static void main(String[] args) {
		
		new SpringApplicationBuilder(SpringCloudApplication.class).web(true).run(args);
	}
}


/**
 * ----
 * 服务发现（Eureka）
 * 断路器（Hystrix）
 * 智能路有（Zuul）
 * 客户端负载均衡（Ribbon）
 * ----
 * */