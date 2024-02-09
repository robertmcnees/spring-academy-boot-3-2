package academy.spring.sample.server;

import java.time.LocalDate;

import academy.spring.sample.server.jdbcclient.Post;
import academy.spring.sample.server.jdbcclient.PostService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(@Qualifier("jdbcTemplatePostService") PostService postService) {
		return args -> {
			postService.create(new Post("1234", "Hello World", "hello-world", LocalDate.now(), 1, "java, spring"));
		};
	}
}
