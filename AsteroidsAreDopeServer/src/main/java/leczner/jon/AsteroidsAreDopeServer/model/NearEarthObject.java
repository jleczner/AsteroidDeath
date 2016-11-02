package leczner.jon.AsteroidsAreDopeServer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@Entity
public class NearEarthObject {
    @Id
    private Long id;
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

    public NearEarthObject(Long id, String name,
                           String nasaJplUrl, Double absoluteMagnitudeH, Double estimatedDiameterMin,
                           Double estimatedDiameterMax, boolean isPotentiallyHazardous,
                           Double relativeVelocity, Double missDistance, String orbitingBody) {
        this.id = id;
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return values.toString();
    }
}
