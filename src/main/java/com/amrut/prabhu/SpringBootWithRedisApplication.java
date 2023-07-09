package com.amrut.prabhu;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import com.redis.om.spring.annotations.EnableRedisEnhancedRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRedisDocumentRepositories(basePackages = "com.amrut.prabhu.redis.document")
@EnableRedisEnhancedRepositories(basePackages = "com.amrut.prabhu.redis.hash")
@SpringBootApplication
public class SpringBootWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRedisApplication.class, args);
	}

}
