package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.Forum;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface ForumRepository extends CrudRepository<Forum, Long> {
    public Forum findById(Long id);
}
