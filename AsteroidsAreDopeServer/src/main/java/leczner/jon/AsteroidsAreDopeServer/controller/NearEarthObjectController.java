package leczner.jon.AsteroidsAreDopeServer.controller;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectBrowse;
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
    public List<NearEarthObjectBrowse> list() {
        return repo.findAll();
    }

    @RequestMapping(value = "asteroids/{id}", method = RequestMethod.GET)
    public NearEarthObjectBrowse get(@PathVariable String id) {
        return repo.findOne(id);
    }

    @RequestMapping(value = "asteroids", method = RequestMethod.POST)
    public NearEarthObjectBrowse create(@RequestBody NearEarthObjectBrowse neo) {
        return repo.save(neo);
    }
}
