package leczner.jon.AsteroidsAreDopeServer;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AsteroidsAreDopeServerApplication {

	@Bean
	InitializingBean saveData(NearEarthObjectRepository repo){
		return () -> {
			repo.save(new NearEarthObject(
					"2015-09-08",
					"https://api.nasa.gov/neo/rest/v1/neo/3726710?api_key=DEMO_KEY",
					"3726710",
					"(2015 RC)",
					"http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=3726710",
					24.3,
					36.6906137531,
					82.0427064882,
					false,
					"19.4701053405",
					"0.0269024393",
					"Earth"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AsteroidsAreDopeServerApplication.class, args);
	}
}
