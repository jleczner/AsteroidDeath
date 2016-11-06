package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObjectList {
    private NearEarthObject[] near_earth_objects;

    public NearEarthObjectList() {}

    public NearEarthObject[] getNear_earth_objects() {
        return near_earth_objects;
    }

    public void setNear_earth_objects(NearEarthObject[] near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }
}
