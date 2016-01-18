package za.ac.tpProject.Conf.Factory;

import za.ac.tpProject.Domain.PrivateMessage;

import java.util.Map;

/**
 * Created by User on 2015/10/20.
 */
public class PrivateMesssageFactory {

    public static PrivateMessage createBeverage(
            Map<String,String> values, long id, long userOneID, long userTwoID) {
        PrivateMessage privateMessage = new PrivateMessage
                .Builder()
                .setId(id)
                .setRefUserOne(userOneID)
                .setRefUserTwo(userTwoID)
                .setText(values.get("text"))
                .build();

        return privateMessage;

    }
}
