package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelativeVelocity {
    private String kilometers_per_second;
    private String kilometers_per_hour;
    private String miles_per_hour;

    public RelativeVelocity() {}

    public String getKilometers_per_second() {
        return kilometers_per_second;
    }

    public void setKilometers_per_second(String kilometers_per_second) {
        this.kilometers_per_second = kilometers_per_second;
    }

    public String getKilometers_per_hour() {
        return kilometers_per_hour;
    }

    public void setKilometers_per_hour(String kilometers_per_hour) {
        this.kilometers_per_hour = kilometers_per_hour;
    }

    public String getMiles_per_hour() {
        return miles_per_hour;
    }

    public void setMiles_per_hour(String miles_per_hour) {
        this.miles_per_hour = miles_per_hour;
    }
}