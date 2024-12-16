package m2tiw.CatalogueProduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class CatalogueProduitApplication {
	public static void main(String[] args) {
		SpringApplication.run(CatalogueProduitApplication.class, args);
	}
}