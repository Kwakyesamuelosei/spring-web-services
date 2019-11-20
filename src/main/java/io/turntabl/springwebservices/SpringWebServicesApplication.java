package io.turntabl.springwebservices;

import io.turntabl.springwebservices.Controller.Maths;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@EnableSwagger2
@SpringBootApplication
public class SpringWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebServicesApplication.class, args);
	}

	@Bean
	public Maths mathUtil(){
	    return new Maths();
    }
}
