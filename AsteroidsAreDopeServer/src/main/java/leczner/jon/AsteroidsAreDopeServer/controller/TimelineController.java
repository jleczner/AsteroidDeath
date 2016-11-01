package leczner.jon.AsteroidsAreDopeServer.controller;

import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObject;
import leczner.jon.AsteroidsAreDopeServer.model.NearEarthObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@Controller
@RequestMapping("api/v1")
public class TimelineController {

    @Autowired
    NearEarthObjectRepository repo;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("NEO", repo.findAll());
        return "index";
    }

    @RequestMapping(value = "asteroids", method = RequestMethod.GET)
    public List<NearEarthObject> list() {
        return NearEarthObjectStub.list();
    }

    @RequestMapping(value = "asteroids/{neoReferenceId}", method = RequestMethod.POST)
    public NearEarthObject create(@RequestBody NearEarthObject neo) {
        return NearEarthObjectStub.create(neo);
    }
}
