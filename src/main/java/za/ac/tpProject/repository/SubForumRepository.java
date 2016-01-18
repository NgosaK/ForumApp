package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.SubForum;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface SubForumRepository extends CrudRepository<SubForum, Long> {
    public SubForum findById(Long id);
}
