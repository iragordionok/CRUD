package example;

import example.entity.User;
import example.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudAppSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudAppSpringBootApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserService userService) {
		return (args) -> {
			userService.saveUser(new User("Иван", "Иванов", (byte) 25));
			userService.saveUser(new User("Петр", "Петров", (byte) 30));
		};
	}
}
