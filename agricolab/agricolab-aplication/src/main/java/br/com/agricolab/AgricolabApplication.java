package br.com.agricolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"br.com.agricolab.*", "br.com.agricolab.produtor.controller.ProdutorController", "br.com.agricolab.consumidor.controller.ConsumidorController"})
@ComponentScan(basePackages = {"br.com.agricolab.*"})
@EntityScan(basePackages = {"br.com.agricolab.*"})
@EnableJpaRepositories(basePackages = {"br.com.agricolab.*"})
public class AgricolabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgricolabApplication.class, args);
	}

}
