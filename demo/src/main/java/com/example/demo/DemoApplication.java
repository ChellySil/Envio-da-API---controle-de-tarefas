package com.example.demo;

import org.neo4j.cypherdsl.core.renderer.Configuration;
import org.neo4j.cypherdsl.core.renderer.Dialect;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.repository.config.EnableReactiveNeo4jRepositories;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableNeo4jRepositories
@EnableReactiveNeo4jRepositories
@SpringBootApplication
public class DemoApplication {
	@Bean
	Configuration cypherDslConfiguration() {
	 return Configuration.newConfig()
	   .withDialect(Dialect.NEO4J_5).build();
	}
   
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
