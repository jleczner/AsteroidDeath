package leczner.jon.AsteroidsAreDopeServer.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jonathanleczner on 10/23/16.
 */
public class NearEarthObjectStub {
    private static Map<String, NearEarthObject> nearEarthObjects = new HashMap<>();
    private static String idIndex;

    static {
        NearEarthObject test1 = new NearEarthObject(
					"3726710",
					"(2015 RC)",
					"http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=3726710",
					24.3,
					36.6906137531,
					82.0427064882,
					false,
					"19.4701053405",
					"0.0269024393",
					"Earth");
        nearEarthObjects.put("2015-09-08", test1);

    }
}
