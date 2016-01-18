package za.ac.tpProject.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.tpProject.Domain.Post;

/**
 * Created by Yusiry Davids on 11/19/2015.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
   public Post findById(Long id);
}
