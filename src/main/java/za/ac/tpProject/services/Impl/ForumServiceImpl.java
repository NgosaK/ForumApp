package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.Forum;
import za.ac.tpProject.repository.ForumRepository;
import za.ac.tpProject.services.ForumService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class ForumServiceImpl implements ForumService {
    @Autowired
    ForumRepository repository;
    public List<Forum> getForums() {
        List<Forum> allForums = new ArrayList<Forum>();

        Iterable<Forum> forums = repository.findAll();
        for(Forum forum : forums){
            allForums.add(forum);
        }

        return allForums;
    }
}
