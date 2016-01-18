package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.Topic;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class TopicFactory {

    public static Topic createBeverage(
            Map<String,String> values, long id, long refSubForum) {
        Topic topic = new Topic
                .Builder()
                .setId(id)
                .setRefSubForum(refSubForum)
                .setName(values.get("name"))
                .build();

        return topic;

    }
}
