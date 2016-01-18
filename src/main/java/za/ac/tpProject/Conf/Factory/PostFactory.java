package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.Post;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class PostFactory {

    public static Post createBeverage(
            Map<String,String> values, long id, long refTOpic, long refUser) {
        Post post = new Post
                .Builder()
                .setId(id)
                .setRefTopic(refTOpic)
                .setRefUser(refUser)
                .setText(values.get("text"))
                .setTitle(values.get("title"))
                .build();

        return post;

    }
}
