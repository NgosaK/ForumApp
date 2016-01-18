package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.Users;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class UsersFactory {

    public static Users createBeverage(
            Map<String,String> values, long id, long refSubForum) {
        Users users = new Users
                .Builder()
                .setId(id)
                .setName(values.get("name"))
                .setUsername(values.get("username"))
                .setPassword(values.get("password"))
                .build();

        return users;

    }
}
