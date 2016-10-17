package leczner.jon.AsteroidsAreDopeServer.model;

import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
public class NearEarthObjectList {
    private List<String> links;
    private int elementCount;
    private List<NearEarthObject> nearEarthObjects;

    public NearEarthObjectList() {
    }

    public NearEarthObjectList(List<String> links, int elementCount, List<NearEarthObject> nearEarthObjects) {
        this.links = links;
        this.elementCount = elementCount;
        this.nearEarthObjects = nearEarthObjects;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public int getElementCount() {
        return elementCount;
    }

    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }

    public List<NearEarthObject> getNearEarthObjects() {
        return nearEarthObjects;
    }

    public void setNearEarthObjects(List<NearEarthObject> nearEarthObjects) {
        this.nearEarthObjects = nearEarthObjects;
    }
}
