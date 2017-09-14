package br.com.makewaybrazil.demoauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAuthServerApplication.class, args);
	}
}
