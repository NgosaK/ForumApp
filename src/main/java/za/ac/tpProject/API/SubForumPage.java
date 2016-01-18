package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.SubForum;
import za.ac.tpProject.services.SubForumService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class SubForumPage {

    @Autowired
    private SubForumService service;

    //---------------------Retrieve All Staff -------------------------

    @RequestMapping(value = "subForum/", method = RequestMethod.GET)
    public ResponseEntity<List<SubForum>> listAllStaff(){
        List<SubForum> subForums = service.getSubForums();
        if(subForums.isEmpty()){
            return new ResponseEntity<List<SubForum>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<SubForum>>(subForums, HttpStatus.OK);
    }
}
