package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.Extra;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface ExtraRepository extends CrudRepository<Extra, Long> {
    public Extra findById(Long id);
}
