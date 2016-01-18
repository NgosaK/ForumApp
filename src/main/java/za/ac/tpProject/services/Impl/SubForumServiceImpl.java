package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.SubForum;
import za.ac.tpProject.repository.SubForumRepository;
import za.ac.tpProject.services.SubForumService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class SubForumServiceImpl implements SubForumService {
    @Autowired
    SubForumRepository repository;

    public List<SubForum> getSubForums() {
        List<SubForum> allSubForums = new ArrayList<SubForum>();

        Iterable<SubForum> subForums = repository.findAll();
        for(SubForum subForum : subForums){
            allSubForums.add(subForum);
        }

        return allSubForums;
    }
}
