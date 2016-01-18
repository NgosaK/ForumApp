package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.Topic;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface TopicRepository extends CrudRepository<Topic, Long> {
    public Topic findById(Long id);
}
