package za.ac.tpProject.Conf.Factory;


import za.ac.tpProject.Domain.Extra;

import java.util.Map;

/**
 * Created by User on 2015/10/19.
 */
public class ExtraFactory {

    public static Extra createExtra(
            Map<String,String> values, long id, long refId) {
        Extra extra = new Extra
                .Builder()
                .setMood(values.get("mood"))
                .setRefUserId(refId)
                .setId(id)
                .setStatus(values.get("status"))
                .setSignature(values.get("signature"))
                .build();

        return extra;

    }
}
