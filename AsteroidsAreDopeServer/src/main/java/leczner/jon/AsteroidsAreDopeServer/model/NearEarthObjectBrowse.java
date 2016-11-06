package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObjectList {
    private Links links;
    private List<NearEarthObject> nearEarthObjects;

    public NearEarthObjectList() {
    }

    public NearEarthObjectList(List<String> links, List<NearEarthObject> nearEarthObjects) {
        this.links = links;
        this.nearEarthObjects = nearEarthObjects;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public List<NearEarthObject> getNearEarthObjects() {
        return nearEarthObjects;
    }

    public void setNearEarthObjects(List<NearEarthObject> nearEarthObjects) {
        this.nearEarthObjects = nearEarthObjects;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Near Earth Objects (size=");
        stringBuilder.append(nearEarthObjects.size());
        stringBuilder.append(")\n");
        for (NearEarthObject neo: nearEarthObjects) {
            stringBuilder.append(neo.toString() + "\n");
        }
        return stringBuilder.toString();
    }
}
