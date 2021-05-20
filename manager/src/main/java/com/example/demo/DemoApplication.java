package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableZuulProxy
@SpringCloudApplication
@EnableDiscoveryClient
@MapperScan("com.example.demo.dal.**.mapper")
@ComponentScan(value = { "com.example.demo.*"})
@SpringBootApplication
@EnableCaching
@Slf4j
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@RequestMapping("/hello/{value}")
//	public String hello(@PathVariable String value) {
//		return "word " + value;
//	}

	@Override
	public void run(String...args) throws Exception {
		log.info("FINE.");
	}

}
