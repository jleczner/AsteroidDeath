package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@Document(collection = "asteroids")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObject {
    @Id
    private String neo_reference_id;
    private String name;
    private String nasaJplUrl;
    private Double absoluteMagnitudeH;
    private Double estimatedDiameterMin; // meters
    private Double estimatedDiameterMax;
    private boolean isPotentiallyHazardous;
    private Double relativeVelocity; // km/s
    private Double missDistance; // astronomical units
    private String orbitingBody;

    public NearEarthObject() {
    }

    public NearEarthObject(String neo_reference_id, String name,
                           String nasaJplUrl, Double absoluteMagnitudeH, Double estimatedDiameterMin,
                           Double estimatedDiameterMax, boolean isPotentiallyHazardous,
                           Double relativeVelocity, Double missDistance, String orbitingBody) {
        this.neo_reference_id = neo_reference_id;
        this.name = name;
        this.nasaJplUrl = nasaJplUrl;
        this.absoluteMagnitudeH = absoluteMagnitudeH;
        this.estimatedDiameterMin = estimatedDiameterMin;
        this.estimatedDiameterMax = estimatedDiameterMax;
        this.isPotentiallyHazardous = isPotentiallyHazardous;
        this.relativeVelocity = relativeVelocity;
        this.missDistance = missDistance;
        this.orbitingBody = orbitingBody;
    }
    public String getId() {
        return neo_reference_id;
    }

    public void setId(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNasaJplUrl() {
        return nasaJplUrl;
    }

    public void setNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
    }

    public Double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    public Double getEstimatedDiameterMin() {
        return estimatedDiameterMin;
    }

    public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
        this.estimatedDiameterMin = estimatedDiameterMin;
    }

    public Double getEstimatedDiameterMax() {
        return estimatedDiameterMax;
    }

    public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
        this.estimatedDiameterMax = estimatedDiameterMax;
    }

    public boolean isPotentiallyHazardous() {
        return isPotentiallyHazardous;
    }

    public void setPotentiallyHazardous(boolean potentiallyHazardous) {
        isPotentiallyHazardous = potentiallyHazardous;
    }

    public Double getRelativeVelocity() {
        return relativeVelocity;
    }

    public void setRelativeVelocity(Double relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    public Double getMissDistance() {
        return missDistance;
    }

    public void setMissDistance(Double missDistance) {
        this.missDistance = missDistance;
    }

    public String getOrbitingBody() {
        return orbitingBody;
    }

    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder("NEO(");
        values.append("ID: ");
        values.append(id);
        values.append(")");
        return values.toString();
    }
}
