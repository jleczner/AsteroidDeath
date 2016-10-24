package leczner.jon.AsteroidsAreDopeServer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        nearEarthObjects.put("3726710", test1);

        NearEarthObject test2 = new NearEarthObject(
                "3730577",
                "(2015 TX237)",
                "http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=3730577",
                23.3,
                58.1507039646,
                130.0289270043,
                false,
                "6.5730424387",
                "0.0795210946",
                "Earth");
        nearEarthObjects.put("3730577", test2);

        NearEarthObject test3 = new NearEarthObject(
                "2465633",
                "465633 (2009 JR5)",
                "http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2465633",
                20.3,
                231.5021222103,
                517.6544821978,
                true,
                "18.1279766789",
                "0.3027491578",
                "Earth");
        nearEarthObjects.put("2465633", test3);
    }

    public static List<NearEarthObject> list() {
        return new ArrayList<NearEarthObject>(nearEarthObjects.values());
    }

    public static NearEarthObject create(NearEarthObject nearEarthObject) {
        idIndex = nearEarthObject.getNeoReferenceId();
        nearEarthObjects.put(idIndex, nearEarthObject);
        return nearEarthObject;
    }

    public static NearEarthObject get(String id) {
        return nearEarthObjects.get(id);
    }

    public static NearEarthObject update(String id, NearEarthObject nearEarthObject) {
        nearEarthObjects.put(id, nearEarthObject);
        return nearEarthObject;
    }

    public static NearEarthObject delete(String id) {
        return nearEarthObjects.remove(id);
    }
}
}
