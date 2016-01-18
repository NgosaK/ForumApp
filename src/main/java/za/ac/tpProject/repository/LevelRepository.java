package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.Level;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface LevelRepository extends CrudRepository<Level, Long> {
    public Level findById(Long id);
}
