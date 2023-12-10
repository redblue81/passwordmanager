package it.redblue.passwordmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PasswordManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PasswordManagerApplication.class, args);
	}

}
