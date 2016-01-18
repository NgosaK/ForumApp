package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.PrivateMessage;
import za.ac.tpProject.services.PrivateMessageService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class PrivateMessagePage {

    @Autowired
    private PrivateMessageService service;

    //---------------------Retrieve All PrivateMessage -------------------------

    @RequestMapping(value = "privateMessage/", method = RequestMethod.GET)
    public ResponseEntity<List<PrivateMessage>> listAllStaff(){
        List<PrivateMessage> privateMessages = service.getPrivateMessages();
        if(privateMessages.isEmpty()){
            return new ResponseEntity<List<PrivateMessage>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<PrivateMessage>>(privateMessages, HttpStatus.OK);
    }
}
