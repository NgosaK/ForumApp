package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.Forum;
import za.ac.tpProject.services.ForumService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class ForumPage {
    @Autowired
    private ForumService service;

    //---------------------Retrieve All Forum -------------------------

    @RequestMapping(value = "forum/", method = RequestMethod.GET)
    public ResponseEntity<List<Forum>> listAllStaff(){
        List<Forum> forums = service.getForums();
        if(forums.isEmpty()){
            return new ResponseEntity<List<Forum>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Forum>>(forums, HttpStatus.OK);
    }
}
