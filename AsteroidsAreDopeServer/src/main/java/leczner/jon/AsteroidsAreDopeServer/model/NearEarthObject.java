package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@Document(collection = "asteroids")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObject {

    private NeoLinks links;
    @Id
    private String neoReferenceId;
    private String name;
    private String nasaJPLUrl;
    private double absoluteMagnitudeH;
    private EstimatedDiameter estimatedDiameter;
    private boolean isPotentiallyHazardousAsteroid;
    private List<CloseApproachData> closeApproachData;
    private OrbitalData orbitalData;

    public NearEarthObject() {
    }

    public NeoLinks getLinks() {
        return links;
    }

    public void setLinks(NeoLinks links) {
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

    public String getNasaJPLUrl() {
        return nasaJPLUrl;
    }

    public void setNasaJPLUrl(String nasaJPLUrl) {
        this.nasaJPLUrl = nasaJPLUrl;
    }

    public double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    public void setAbsoluteMagnitudeH(double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public boolean isPotentiallyHazardousAsteroid() {
        return isPotentiallyHazardousAsteroid;
    }

    public void setPotentiallyHazardousAsteroid(boolean potentiallyHazardousAsteroid) {
        isPotentiallyHazardousAsteroid = potentiallyHazardousAsteroid;
    }

    public List<CloseApproachData> getCloseApproachData() {
        return closeApproachData;
    }

    public void setCloseApproachData(List<CloseApproachData> closeApproachData) {
        this.closeApproachData = closeApproachData;
    }

    public OrbitalData getOrbitalData() {
        return orbitalData;
    }

    public void setOrbitalData(OrbitalData orbitalData) {
        this.orbitalData = orbitalData;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder("NEO(");
        values.append("ID: ");
        values.append(neoReferenceId);
        values.append(")");
        return values.toString();
    }
}
