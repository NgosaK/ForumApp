package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.Extra;
import za.ac.tpProject.services.ExtraService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class ExtraPage {

    @Autowired
    private ExtraService service;

    //---------------------Retrieve All Extra -------------------------

    @RequestMapping(value = "extra/", method = RequestMethod.GET)
    public ResponseEntity<List<Extra>> listAllStaff(){
        List<Extra> extras = service.getExtras();
        if(extras.isEmpty()){
            return new ResponseEntity<List<Extra>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Extra>>(extras, HttpStatus.OK);
    }
}
