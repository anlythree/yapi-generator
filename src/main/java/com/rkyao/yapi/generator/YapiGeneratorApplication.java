package com.rkyao.yapi.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class YapiGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(YapiGeneratorApplication.class, args);
		SpringApplication.exit(run);
	}

}
