package com.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages="com.emart.*")
@SpringBootApplication
public class EmartApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EmartApplication.class, args);
	}	
}
