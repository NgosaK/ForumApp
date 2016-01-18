package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.Users;
import za.ac.tpProject.services.UserService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class UsersPage {

    @Autowired
    private UserService service;

    //---------------------Retrieve All Staff -------------------------

    @RequestMapping(value = "users/", method = RequestMethod.GET)
    public ResponseEntity<List<Users>> listAllStaff(){
        List<Users> users = service.getUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<Users>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
    }
}
