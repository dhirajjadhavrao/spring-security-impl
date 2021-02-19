package sample.spring.jwtSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sample.spring.jwtSecurity")
public class JwtSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurityApplication.class, args);
	}

}
