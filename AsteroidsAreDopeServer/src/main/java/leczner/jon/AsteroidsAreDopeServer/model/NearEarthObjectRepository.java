package leczner.jon.AsteroidsAreDopeServer.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by jonathanleczner on 10/22/16.
 */
public interface NearEarthObjectRepository extends MongoRepository<NearEarthObject, String> {
    List<NearEarthObject> findByIsPotentiallyHazardousAsteroidTrue();

}
