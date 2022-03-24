package br.com.agricolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"br.com.agricolab", "br.com.agricolab.produtor.controller.Controller"})
public class AgricolabApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgricolabApplication.class, args);
	}

}
