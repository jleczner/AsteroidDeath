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
    private List<NearEarthObject> near_earth_objects;

    public NearEarthObjectBrowse() {
    }

    public NearEarthObjectBrowse(Links links, Page page, List<NearEarthObject> near_earth_objects) {
        this.links = links;
        this.page = page;
        this.near_earth_objects = near_earth_objects;
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
        return near_earth_objects;
    }

    public void setNearEarthObjects(List<NearEarthObject> near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Near Earth Objects (size=");
        int length = (near_earth_objects == null) ? 0 : near_earth_objects.size();
        stringBuilder.append(length);
        stringBuilder.append(")\n");
        while (near_earth_objects != null) {
            for (NearEarthObject neo : near_earth_objects) {
                stringBuilder.append(neo.toString());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
