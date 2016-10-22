package leczner.jon.AsteroidsAreDopeServer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@Entity
public class NearEarthObject {
    @Id
    private String date;
    private String[] links;
    private String neoReferenceId;
    private String name;
    private String nasaJplUrl;
    private Double absoluteMagnitudeH;
    private Double estimatedDiameterMin;
    private Double estimatedDiameterMax;
    private boolean isPotentiallyHazardous;
    private String closeApproachDate;
    private Long epochDateCloseApproach;
    private String relativeVelocity;
    private String missDistance;
    private String orbitingBody;

    public NearEarthObject() {
    }

    public NearEarthObject(String date, String[] links, String neoReferenceId, String name,
                           String nasaJplUrl, Double absoluteMagnitudeH, Double estimatedDiameterMin,
                           Double estimatedDiameterMax, boolean isPotentiallyHazardous,
                           String closeApproachDate, Long epochDateCloseApproach, String relativeVelocity,
                           String missDistance, String orbitingBody) {
        this.date = date;
        this.links = links;
        this.neoReferenceId = neoReferenceId;
        this.name = name;
        this.nasaJplUrl = nasaJplUrl;
        this.absoluteMagnitudeH = absoluteMagnitudeH;
        this.estimatedDiameterMin = estimatedDiameterMin;
        this.estimatedDiameterMax = estimatedDiameterMax;
        this.isPotentiallyHazardous = isPotentiallyHazardous;
        this.closeApproachDate = closeApproachDate;
        this.epochDateCloseApproach = epochDateCloseApproach;
        this.relativeVelocity = relativeVelocity;
        this.missDistance = missDistance;
        this.orbitingBody = orbitingBody;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getLinks() {
        return links;
    }

    public void setLinks(String[] links) {
        this.links = links;
    }

    public String getNeoReferenceId() {
        return neoReferenceId;
    }

    public void setNeoReferenceId(String neoReferenceId) {
        this.neoReferenceId = neoReferenceId;
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

    public String getCloseApproachDate() {
        return closeApproachDate;
    }

    public void setCloseApproachDate(String closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    public Long getEpochDateCloseApproach() {
        return epochDateCloseApproach;
    }

    public void setEpochDateCloseApproach(Long epochDateCloseApproach) {
        this.epochDateCloseApproach = epochDateCloseApproach;
    }

    public String getRelativeVelocity() {
        return relativeVelocity;
    }

    public void setRelativeVelocity(String relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    public String getMissDistance() {
        return missDistance;
    }

    public void setMissDistance(String missDistance) {
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
        values.append("Date: ");
        values.append(date);
        values.append(", Links: ");
        values.append(links);
        values.append("NEO Reference ID: ");
        values.append(neoReferenceId);
        return values.toString();
    }
}
