package springboot.logging.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "Hello World";
	}

}
