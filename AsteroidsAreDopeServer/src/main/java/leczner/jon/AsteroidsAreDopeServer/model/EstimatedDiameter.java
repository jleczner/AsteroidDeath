package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EstimatedDiameter {
    private DiameterRange kilometers;
    private DiameterRange meters;
    private DiameterRange miles;
    private DiameterRange feet;

    public EstimatedDiameter() {}

    public DiameterRange getKilometers() {
        return kilometers;
    }

    public void setKilometers(DiameterRange kilometers) {
        this.kilometers = kilometers;
    }

    public DiameterRange getMeters() {
        return meters;
    }

    public void setMeters(DiameterRange meters) {
        this.meters = meters;
    }

    public DiameterRange getMiles() {
        return miles;
    }

    public void setMiles(DiameterRange miles) {
        this.miles = miles;
    }

    public DiameterRange getFeet() {
        return feet;
    }

    public void setFeet(DiameterRange feet) {
        this.feet = feet;
    }
}
