package topicos.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.getenv().forEach((k, v) -> System.out.println(k + " : " + v));
		SpringApplication app = new SpringApplication(DemoApplication.class);
		// SpringApplication.run(DemoApplication.class, args);
		app.run(args);
	}

}
