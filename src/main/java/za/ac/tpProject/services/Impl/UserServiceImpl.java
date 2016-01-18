package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.Users;
import za.ac.tpProject.repository.UsersRepository;
import za.ac.tpProject.services.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UsersRepository repository;

    public List<Users> getUsers() {
        List<Users> allUsers = new ArrayList<Users>();

        Iterable<Users> users = repository.findAll();
        for(Users user : users){
            allUsers.add(user);
        }

        return allUsers;
    }
}
