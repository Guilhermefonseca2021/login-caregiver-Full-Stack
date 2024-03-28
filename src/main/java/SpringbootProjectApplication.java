

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.store.models")
@ComponentScan({"br.com.store.controllers"})
public class SpringbootProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}
	
}
