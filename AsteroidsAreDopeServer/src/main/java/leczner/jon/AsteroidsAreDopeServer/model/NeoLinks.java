package leczner.jon.AsteroidsAreDopeServer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jonathanleczner on 11/6/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeoLinks {
        private String self;

        public NeoLinks() {}

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }
}
