package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.SubForum;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class SubForumFactory {

    public static SubForum createBeverage(
            Map<String,String> values, long id, long refForum) {
        SubForum subForum = new SubForum
                .Builder()
                .setId(id)
                .setRefForum(refForum)
                .setName(values.get("name"))
                .build();

        return subForum;

    }
}
