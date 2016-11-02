package leczner.jon.AsteroidsAreDopeServer.controller;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@Controller
@RequestMapping("api/v1")
public class NearEarthObjectController {

    @Autowired
    NearEarthObjectRepository repo;

    @RequestMapping(value = "asteroids", method = RequestMethod.GET)
    public List<NearEarthObject> list() {
        return NearEarthObjectStub.list();
    }

    @RequestMapping(value = "asteroids/{neoReferenceId}", method = RequestMethod.GET)
    public NearEarthObject get(@PathVariable String neoReferenceId) {
        return NearEarthObjectStub.get(neoReferenceId);
    }

    @RequestMapping(value = "asteroids", method = RequestMethod.POST)
    public NearEarthObject create(@RequestBody NearEarthObject neo) {
        return NearEarthObjectStub.create(neo);
    }
}