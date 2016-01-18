package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.Users;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface UsersRepository extends CrudRepository<Users, Long> {
    public Users findById(Long id);

}
