package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloseApproachDataList {
    private CloseApproachData[] closeApproachDataList;

    public CloseApproachDataList() {}

    public CloseApproachData[] getCloseApproachDataList() {
        return closeApproachDataList;
    }

    public void setCloseApproachDataList(CloseApproachData[] closeApproachDataList) {
        this.closeApproachDataList = closeApproachDataList;
    }
}
