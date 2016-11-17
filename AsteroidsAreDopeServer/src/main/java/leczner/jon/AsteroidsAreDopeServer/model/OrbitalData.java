package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrbitalData {
    private String orbitId;
    private String orbitDeterminationDate;
    private String orbitUncertainty;
    private String minimumOrbitIntersection;
    private String jupiterTisserandInvariant;
    private String epochOsculation;
    private String eccentricity;
    private String semiMajorAxis;
    private String inclination;
    private String ascendingNodeLongitude;
    private String orbitalPeriod;
    private String perihelionDistance;
    private String perihelionArgument;
    private String aphelionDistance;
    private String perihelionTime;
    private String meanAnomaly;
    private String meanMotion;
    private String equinox;

    public OrbitalData() {}

    public String getOrbitId() {
        return orbitId;
    }

    public void setOrbitId(String orbitId) {
        this.orbitId = orbitId;
    }

    public String getOrbitDeterminationDate() {
        return orbitDeterminationDate;
    }

    public void setOrbitDeterminationDate(String orbitDeterminationDate) {
        this.orbitDeterminationDate = orbitDeterminationDate;
    }

    public String getOrbitUncertainty() {
        return orbitUncertainty;
    }

    public void setOrbitUncertainty(String orbitUncertainty) {
        this.orbitUncertainty = orbitUncertainty;
    }

    public String getMinimumOrbitIntersection() {
        return minimumOrbitIntersection;
    }

    public void setMinimumOrbitIntersection(String minimumOrbitIntersection) {
        this.minimumOrbitIntersection = minimumOrbitIntersection;
    }

    public String getJupiterTisserandInvariant() {
        return jupiterTisserandInvariant;
    }

    public void setJupiterTisserandInvariant(String jupiterTisserandInvariant) {
        this.jupiterTisserandInvariant = jupiterTisserandInvariant;
    }

    public String getEpochOsculation() {
        return epochOsculation;
    }

    public void setEpochOsculation(String epochOsculation) {
        this.epochOsculation = epochOsculation;
    }

    public String getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    public String getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(String semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public String getInclination() {
        return inclination;
    }

    public void setInclination(String inclination) {
        this.inclination = inclination;
    }

    public String getAscendingNodeLongitude() {
        return ascendingNodeLongitude;
    }

    public void setAscendingNodeLongitude(String ascendingNodeLongitude) {
        this.ascendingNodeLongitude = ascendingNodeLongitude;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getPerihelionDistance() {
        return perihelionDistance;
    }

    public void setPerihelionDistance(String perihelionDistance) {
        this.perihelionDistance = perihelionDistance;
    }

    public String getPerihelionArgument() {
        return perihelionArgument;
    }

    public void setPerihelionArgument(String perihelionArgument) {
        this.perihelionArgument = perihelionArgument;
    }

    public String getAphelionDistance() {
        return aphelionDistance;
    }

    public void setAphelionDistance(String aphelionDistance) {
        this.aphelionDistance = aphelionDistance;
    }

    public String getPerihelionTime() {
        return perihelionTime;
    }

    public void setPerihelionTime(String perihelionTime) {
        this.perihelionTime = perihelionTime;
    }

    public String getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setMeanAnomaly(String meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public String getMeanMotion() {
        return meanMotion;
    }

    public void setMeanMotion(String meanMotion) {
        this.meanMotion = meanMotion;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
    }
}
