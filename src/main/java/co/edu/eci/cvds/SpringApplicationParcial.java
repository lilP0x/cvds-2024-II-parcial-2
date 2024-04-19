package co.edu.eci.cvds;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.service.ConfigurationService;
import co.edu.eci.cvds.model.Parcial;
import co.edu.eci.cvds.service.ParcialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class SpringApplicationParcial {
	private final ParcialService parcialService;

	@Autowired
	public SpringApplicationParcial(
			ParcialService parcialService
	) {
		this.parcialService = parcialService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationParcial.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			System.out.println("Exitos en este parcial");
		};
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
