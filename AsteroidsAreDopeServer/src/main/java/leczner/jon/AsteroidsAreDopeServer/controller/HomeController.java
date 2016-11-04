package leczner.jon.AsteroidsAreDopeServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonathanleczner on 10/16/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Welcome";
    }
}
