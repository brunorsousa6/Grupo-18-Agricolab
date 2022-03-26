package br.com.agricolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.agricolab.*"})
@EntityScan(basePackages = {"br.com.agricolab.*"})
@EnableJpaRepositories(basePackages = {"br.com.agricolab.*"})
public class AgricolabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgricolabApplication.class, args);
	}

}
