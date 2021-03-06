package br.com.makewaybrazil.demoeurekaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoEurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaConfigServerApplication.class, args);
	}
}