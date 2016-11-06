package leczner.jon.AsteroidsAreDopeServer.model;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jonathanleczner on 10/22/16.
 */
public interface NearEarthObjectRepository extends MongoRepository<NearEarthObjectBrowse, String> {
//    List<NearEarthObjectBrowse> findByIsPotentiallyHazardousTrue();
}
