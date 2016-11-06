package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by jonathanleczner on 10/16/16.
 */
//@Document(collection = "asteroids")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObject {
//    @Id
    private NeoLinks links;
    private String neo_reference_id;
    private String name;
    private String nasa_jpl_url;
    private double absolute_magnitude_h;
    private EstimatedDiameter estimated_diameter;
    private boolean is_potentially_hazardous_asteroid;
    private CloseApproachDataList close_approach_data;
    private OrbitalData orbital_data;

    public NearEarthObject() {
    }

    public NeoLinks getLinks() {
        return links;
    }

    public void setLinks(NeoLinks links) {
        this.links = links;
    }

    public String getNeo_reference_id() {
        return neo_reference_id;
    }

    public void setNeo_reference_id(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    public Double getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(Double absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public EstimatedDiameter getEstimated_diameter() {
        return estimated_diameter;
    }

    public void setEstimated_diameter(EstimatedDiameter estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    public boolean is_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public CloseApproachDataList getClose_approach_data() {
        return close_approach_data;
    }

    public void setClose_approach_data(CloseApproachDataList close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    public OrbitalData getOrbital_data() {
        return orbital_data;
    }

    public void setOrbital_data(OrbitalData orbital_data) {
        this.orbital_data = orbital_data;
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
