package br.com.unisales.trabalhoRomulo.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"br.com.unisales.trabalhoRomulo.model", "br.com.unisales.trabalhoRomulo.repository"})

@ComponentScan(basePackages = {"br.com.unisales.trabalhoRomulo.model"})
@EntityScan("br.com.unisales.trabalhoRomulo.model")
@SpringBootApplication
public class TrabalhoRomuloApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoRomuloApplication.class, args);
	}

}
