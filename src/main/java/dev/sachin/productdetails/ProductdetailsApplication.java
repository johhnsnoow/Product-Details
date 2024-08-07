package dev.sachin.productdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProductdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdetailsApplication.class, args);
	}

	@GetMapping("/hi")
	public String getSet() {
		return "Hello World";
	}

}
