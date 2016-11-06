package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrbitalData {
    private String orbit_id;
    private String orbit_determination_date;
    private String orbit_uncertainty;
    private String minimum_orbit_intersection;
    private String jupiter_tisserand_invariant;
    private String epoch_osculation;
    private String eccentricity;
    private String semi_major_axis;
    private String inclination;
    private String ascending_node_longitude;
    private String orbital_period;
    private String perihelion_distance;
    private String perihelion_argument;
    private String aphelion_distance;
    private String perihelion_time;
    private String mean_anomaly;
    private String mean_motion;
    private String equinox;

    public OrbitalData() {}

    public String getOrbit_id() {
        return orbit_id;
    }

    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getOrbit_determination_date() {
        return orbit_determination_date;
    }

    public void setOrbit_determination_date(String orbit_determination_date) {
        this.orbit_determination_date = orbit_determination_date;
    }

    public String getOrbit_uncertainty() {
        return orbit_uncertainty;
    }

    public void setOrbit_uncertainty(String orbit_uncertainty) {
        this.orbit_uncertainty = orbit_uncertainty;
    }

    public String getMinimum_orbit_intersection() {
        return minimum_orbit_intersection;
    }

    public void setMinimum_orbit_intersection(String minimum_orbit_intersection) {
        this.minimum_orbit_intersection = minimum_orbit_intersection;
    }

    public String getJupiter_tisserand_invariant() {
        return jupiter_tisserand_invariant;
    }

    public void setJupiter_tisserand_invariant(String jupiter_tisserand_invariant) {
        this.jupiter_tisserand_invariant = jupiter_tisserand_invariant;
    }

    public String getEpoch_osculation() {
        return epoch_osculation;
    }

    public void setEpoch_osculation(String epoch_osculation) {
        this.epoch_osculation = epoch_osculation;
    }

    public String getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public String getSemi_major_axis() {
        return semi_major_axis;
    }

    public void setSemi_major_axis(String semi_major_axis) {
        this.semi_major_axis = semi_major_axis;
    }

    public String getInclination() {
        return inclination;
    }

    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    public String getAscending_node_longitude() {
        return ascending_node_longitude;
    }

    public void setAscending_node_longitude(String ascending_node_longitude) {
        this.ascending_node_longitude = ascending_node_longitude;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getPerihelion_distance() {
        return perihelion_distance;
    }

    public void setPerihelion_distance(String perihelion_distance) {
        this.perihelion_distance = perihelion_distance;
    }

    public String getPerihelion_argument() {
        return perihelion_argument;
    }

    public void setPerihelion_argument(String perihelion_argument) {
        this.perihelion_argument = perihelion_argument;
    }

    public String getAphelion_distance() {
        return aphelion_distance;
    }

    public void setAphelion_distance(String aphelion_distance) {
        this.aphelion_distance = aphelion_distance;
    }

    public String getPerihelion_time() {
        return perihelion_time;
    }

    public void setPerihelion_time(String perihelion_time) {
        this.perihelion_time = perihelion_time;
    }

    public String getMean_anomaly() {
        return mean_anomaly;
    }

    public void setMean_anomaly(String mean_anomaly) {
        this.mean_anomaly = mean_anomaly;
    }

    public String getMean_motion() {
        return mean_motion;
    }

    public void setMean_motion(String mean_motion) {
        this.mean_motion = mean_motion;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }
}
