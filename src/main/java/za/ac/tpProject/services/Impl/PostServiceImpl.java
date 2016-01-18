package za.ac.tpProject.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.tpProject.Domain.Post;
import za.ac.tpProject.repository.PostRepository;
import za.ac.tpProject.services.PostService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yusiry Davids on 11/22/2015.
 */
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository repository;

    public List<Post> getPosts() {
        List<Post> allPosts = new ArrayList<Post>();

        Iterable<Post> posts = repository.findAll();
        for(Post post: posts){
            allPosts.add(post);
        }

        return allPosts;
    }
}
