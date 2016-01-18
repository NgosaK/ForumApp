package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.Level;
import za.ac.tpProject.services.LevelService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class LevelPage {

    @Autowired
    private LevelService service;

    //---------------------Retrieve All Staff -------------------------

    @RequestMapping(value = "level/", method = RequestMethod.GET)
    public ResponseEntity<List<Level>> listAllStaff(){
        List<Level> levels = service.getLevels();
        if(levels.isEmpty()){
            return new ResponseEntity<List<Level>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Level>>(levels, HttpStatus.OK);
    }
}
