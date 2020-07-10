package org.pract.demo.two;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class DemoTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTwoApplication.class, args);
	}

}
