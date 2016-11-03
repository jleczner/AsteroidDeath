package leczner.jon.AsteroidsAreDopeServer.controller;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@RestController
@RequestMapping("api/v1/")
public class NearEarthObjectController {

    @Autowired
    NearEarthObjectRepository repo;

    @RequestMapping(value = "asteroids", method = RequestMethod.GET)
    public List<NearEarthObject> list() {
        return NearEarthObjectStub.list();
    }

    @RequestMapping(value = "asteroids/{id}", method = RequestMethod.GET)
    public NearEarthObject get(@PathVariable Long id) {
        return NearEarthObjectStub.get(id);
    }

    @RequestMapping(value = "asteroids", method = RequestMethod.POST)
    public NearEarthObject create(@RequestBody NearEarthObject neo) {
        return NearEarthObjectStub.create(neo);
    }
}
