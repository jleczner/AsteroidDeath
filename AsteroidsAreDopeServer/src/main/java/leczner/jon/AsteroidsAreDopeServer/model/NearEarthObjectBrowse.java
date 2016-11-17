package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObjectBrowse {
    private Links links;
    private Page page;
    @JsonProperty("near_earth_objects")
    private List<NearEarthObject> nearEarthObjects;

    public NearEarthObjectBrowse() {
    }

    public NearEarthObjectBrowse(Links links, Page page, List<NearEarthObject> nearEarthObjects) {
        this.links = links;
        this.page = page;
        this.nearEarthObjects = nearEarthObjects;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
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
        int length = (nearEarthObjects == null) ? 0 : nearEarthObjects.size();
        stringBuilder.append(length);
        stringBuilder.append("); ");
        stringBuilder.append("Page ");
        stringBuilder.append(page.getNumber());
        stringBuilder.append(" of ");
        stringBuilder.append(page.getTotalPages());
        return stringBuilder.toString();
    }
}
