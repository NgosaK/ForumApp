package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.services.ForumService;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private ForumService service;
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index(){
        return "<h1>PEEBLE FORUM</h1>";
    }

}
