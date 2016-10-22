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
			repo.save(new NearEarthObject("2015-09-08", ));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AsteroidsAreDopeServerApplication.class, args);
	}
}
