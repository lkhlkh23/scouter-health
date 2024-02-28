package scouter.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class ScouterHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScouterHealthApplication.class, args);
	}

}
