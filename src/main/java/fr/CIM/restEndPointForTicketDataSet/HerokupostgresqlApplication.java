package fr.CIM.restEndPointForTicketDataSet;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.CIM.restEndPointForTicketDataSet.entites.Product;
import fr.CIM.restEndPointForTicketDataSet.repositories.ProductRepository;

@SpringBootApplication
@RestController
public class HerokupostgresqlApplication implements CommandLineRunner {
	@Autowired
ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(HerokupostgresqlApplication.class, args);
	}
	@GetMapping(path="/hello")
	public String hello() {
		return "Hello from heroku";
	}
	@Override
	public void run(String... args) throws Exception {
		Stream.of("prod1","prod2", "prod3" ).forEach(p->{
			productRepository.save(new Product(p));
		});
	}
	

}
