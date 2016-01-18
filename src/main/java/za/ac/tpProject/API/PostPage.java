package za.ac.tpProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tpProject.Domain.Post;
import za.ac.tpProject.services.PostService;

import java.util.List;

/**
 * Created by User on 2015/11/22.
 */
@RestController
@RequestMapping("/api/")
public class PostPage {

    @Autowired
    private PostService service;

    //---------------------Retrieve All Staff -------------------------

    @RequestMapping(value = "post/", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> listAllStaff(){
        List<Post> posts = service.getPosts();
        if(posts.isEmpty()){
            return new ResponseEntity<List<Post>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }
}
