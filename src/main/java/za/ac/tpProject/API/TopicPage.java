package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.Topic;
import za.ac.tpProject.services.TopicService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class TopicPage {

    @Autowired
    private TopicService service;

    //---------------------Retrieve All Staff -------------------------

    @RequestMapping(value = "topic/", method = RequestMethod.GET)
    public ResponseEntity<List<Topic>> listAllStaff(){
        List<Topic> topics = service.getTopics();
        if(topics.isEmpty()){
            return new ResponseEntity<List<Topic>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Topic>>(topics, HttpStatus.OK);
    }
}
