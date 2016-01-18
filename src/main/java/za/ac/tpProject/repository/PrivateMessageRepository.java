package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.PrivateMessage;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface PrivateMessageRepository extends CrudRepository<PrivateMessage, Long> {
    public PrivateMessage findById(Long id);
}
