package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.Topic;
import za.ac.tpProject.repository.TopicRepository;
import za.ac.tpProject.services.TopicService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicRepository repository;
    public List<Topic> getTopics() {
        List<Topic> allTopics = new ArrayList<Topic>();

        Iterable<Topic> topics = repository.findAll();

        for(Topic topic : topics){
            allTopics.add(topic);
        }

        return allTopics;
    }
}
