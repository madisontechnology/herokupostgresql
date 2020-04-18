package fr.CIM.restEndPointForTicketDataSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokupostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokupostgresqlApplication.class, args);
	}
	@GetMapping(path="/hello")
	public String hello() {
		return "Hello from heroku";
	}

}
