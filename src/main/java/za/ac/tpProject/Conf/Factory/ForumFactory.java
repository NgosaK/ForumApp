package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.Forum;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class ForumFactory {

    public static Forum createForum(
            Map<String,String> values, long id) {
        Forum forum = new Forum
                .Builder()
                .setId(id)
                .setName(values.get("name"))
                .build();

        return forum;

    }
}
