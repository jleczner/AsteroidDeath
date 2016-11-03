package leczner.jon.AsteroidsAreDopeServer.controller;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jonathanleczner on 10/23/16.
 */
public class NearEarthObjectStub {
    private static Map<Long, NearEarthObject> nearEarthObjects = new HashMap<>();
    private static Long idIndex = 2465633L;

    static {
        NearEarthObject test1 = new NearEarthObject(
					3726710L,
					"(2015 RC)",
					"http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=3726710",
					24.3,
					36.6906137531,
					82.0427064882,
					false,
					19.4701053405,
					0.0269024393,
					"Earth");
        nearEarthObjects.put(3726710L, test1);

        NearEarthObject test2 = new NearEarthObject(
                3730577L,
                "(2015 TX237)",
                "http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=3730577",
                23.3,
                58.1507039646,
                130.0289270043,
                false,
                6.5730424387,
                0.0795210946,
                "Earth");
        nearEarthObjects.put(3730577L, test2);

        NearEarthObject test3 = new NearEarthObject(
                2465633L,
                "465633 (2009 JR5)",
                "http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2465633",
                20.3,
                231.5021222103,
                517.6544821978,
                true,
                18.1279766789,
                0.3027491578,
                "Earth");
        nearEarthObjects.put(2465633L, test3);
    }

    public static List<NearEarthObject> list() {
        return new ArrayList<>(nearEarthObjects.values());
    }

    public static NearEarthObject create(NearEarthObject nearEarthObject) {
        idIndex = nearEarthObject.getId();
        nearEarthObjects.put(idIndex, nearEarthObject);
        return nearEarthObject;
    }

    public static NearEarthObject get(Long id) {
        return nearEarthObjects.get(id);
    }
}

