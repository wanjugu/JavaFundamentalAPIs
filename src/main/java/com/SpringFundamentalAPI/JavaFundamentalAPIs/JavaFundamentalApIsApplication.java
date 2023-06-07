package com.SpringFundamentalAPI.JavaFundamentalAPIs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JavaFundamentalApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaFundamentalApIsApplication.class, args);
		System.out.println("\n*******JavaApplication Started Successful");
	}

}
