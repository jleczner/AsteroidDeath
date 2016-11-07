package leczner.jon.AsteroidsAreDopeServer;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectBrowse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AsteroidsAreDopeServerApplication {
	private static final String apiKey = "xw7eYH1YqEemakwQoq59XaHEVhDmW2cYFbTF0FTm";
	private static final Logger log = LoggerFactory.getLogger(AsteroidsAreDopeServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AsteroidsAreDopeServerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			NearEarthObjectBrowse neoList = restTemplate.getForObject(
					"https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=" + apiKey, NearEarthObjectBrowse.class);
			log.info(neoList.toString());
		};
	}
}
